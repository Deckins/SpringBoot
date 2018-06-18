package com.yourname.Controller;

import com.yourname.Entity.Student;
import com.yourname.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return  studentService.getAllStudents();
    }
    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return this.studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.DELETE)
    public void removeStudentById(@PathVariable("id") int id){
         this.studentService.removeStudentById(id);
    }
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudents(@RequestBody Student student){
        this.studentService.updateStudents(student);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudents(@RequestBody Student newStudent){
        this.studentService.insertStudents(newStudent);
    }
}
