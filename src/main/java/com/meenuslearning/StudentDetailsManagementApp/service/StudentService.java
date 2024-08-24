package com.meenuslearning.StudentDetailsManagementApp.service;

import com.meenuslearning.StudentDetailsManagementApp.model.Student;
import com.meenuslearning.StudentDetailsManagementApp.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired

    private StudentRepo repo;
    public  void addStudent(Student student) {
        repo.save(student);
    }



    public List<Student> getStudentDetails(String sName) {
        return repo.findByCriteria( sName);
    }


}
