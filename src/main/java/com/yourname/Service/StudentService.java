package com.yourname.Service;

import com.yourname.Entity.Student;

import java.util.Collection;
import java.util.List;

public interface StudentService {
//    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    int removeStudentById(int id);
//
    int updateStudents(Student student);

    int insertStudents(Student newStudent);

    List<Student> getAllStudents();
}
