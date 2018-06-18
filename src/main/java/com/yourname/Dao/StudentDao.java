package com.yourname.Dao;

import com.yourname.Entity.Student;

import java.util.List;

public interface StudentDao {
//    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    int removeStudentById(int id);
//
    int updateStudents(Student student);

    int insertStudents(Student student);

    List<Student> getAllStudents();
}
