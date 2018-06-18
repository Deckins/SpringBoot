package com.yourname.Dao;

import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Qualifier("fakeData")
public class StudentDaoImpl implements StudentDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public class StudentRowMapper implements RowMapper<Student>{
        @Override
        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
            Student student = new Student();
            student.setId(rs.getInt("id"));
            student.setName(rs.getString("name"));
            student.setCourse(rs.getString("course"));
            return student;
        }
    }
    public List<Student> getAllStudents() {
        return jdbcTemplate.query("select * from student", new StudentRowMapper());
    }

    /*private static Map<Integer,Student> students;

    static{

        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "said", "Computer Science"));
                put(2, new Student(2, "Alex U", "Finance"));
                put(3, new Student(3, "Anna", "Maths"));
            }
        };
    }
    */
    @Override
    public Student getStudentById(int id) {
        return jdbcTemplate.queryForObject("SELECT * from student where id = ?", new Object[]{id},
                new BeanPropertyRowMapper<Student>(Student.class));
    }

    @Override
    public int removeStudentById(int id) {
        return jdbcTemplate.update("DELETE from student where id = ?" , new Object[]{id});
    }
    @Override
    public int updateStudents(Student student){
        return jdbcTemplate.update("update student " + " set name = ?, course = ? " + " where id = ? ",
                new Object[]{student.getName(), student.getCourse(), student.getId()});
    }

    @Override
    public int insertStudents(Student newStudent){
        return jdbcTemplate.update("insert into student (id,name,course) " + "values(?,?,?)",
                new Object[]{newStudent.getId(),newStudent.getName(), newStudent.getCourse()});
    }
//}
}

