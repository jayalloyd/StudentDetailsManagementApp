package com.meenuslearning.StudentDetailsManagementApp.controller;

import com.meenuslearning.StudentDetailsManagementApp.model.Student;
import com.meenuslearning.StudentDetailsManagementApp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.querydsl.QPageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService service;


    @PostMapping("/search")
    public Page<Student> getAllStudents(@RequestBody Student student){
        PageRequest pr= PageRequest.of(0,3);
           return service.getStudentDetails(student.getsName(),pr);
    }
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){

        service.addStudent(student);
        return student;
    }
@DeleteMapping("/delete")
public Student deleteStudent(@RequestBody  Student  student){
        service.deleteStudentBycourseName(student.getCourseName());
        return  student;
}



}
