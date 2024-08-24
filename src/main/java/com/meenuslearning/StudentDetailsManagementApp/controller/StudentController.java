package com.meenuslearning.StudentDetailsManagementApp.controller;

import com.meenuslearning.StudentDetailsManagementApp.model.Student;
import com.meenuslearning.StudentDetailsManagementApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;


    @PostMapping("/search")
    public ResponseEntity <List<Student>> getAllStudents(@RequestBody Student student){
        List<Student>students= service.getStudentDetails(student.getsName());
        return  ResponseEntity.ok(students);
    }
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){

        service.addStudent(student);
        return student;
    }



}
