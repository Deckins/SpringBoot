//package com.yourname.Dao;
//
//import com.yourname.Entity.Student;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.Collection;
//@Repository
//@Qualifier("mongoDao")
//public class MongoDatabaseImpl implements StudentDao {
//    @Override
//    public Collection<Student> getAllStudents() {
//        return new ArrayList<Student>() {
//            {
//                add(new Student(1, "Mario", "Nothing"));
//            }
//        };
//    }
//
//    @Override
//    public Student getStudentById(int id) {
//        return null;
//    }
//
//    @Override
//    public void removeStudentById(int id) {
//
//    }
//
//    @Override
//    public void updateStudents(Student student) {
//
//    }
//}
