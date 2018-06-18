package com.yourname.Service;

import com.yourname.Dao.StudentDao;
import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    @Qualifier("fakeData") //Spring will boot up with this Qualifier listed in Dao Implementation
    private StudentDao studentDao;
    /**
     * Service studentDao uses the classes's StudentDao's getAllStudents() method
     */
    @Override
//    public Collection<Student> getAllStudents(){
//        return studentDao.getAllStudents();
//    }
//    @Override
    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    @Override
    public int removeStudentById(int id) {
        return this.studentDao.removeStudentById(id);
    }
//
    @Override
    public int updateStudents(Student student) {
        return studentDao.updateStudents(student);
    }

    @Override
    public int insertStudents(Student newStudent){
        return studentDao.insertStudents(newStudent);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }
}
