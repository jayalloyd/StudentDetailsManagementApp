package com.meenuslearning.StudentDetailsManagementApp.service;

import com.meenuslearning.StudentDetailsManagementApp.model.Student;
import com.meenuslearning.StudentDetailsManagementApp.repo.StudentRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired

    private StudentRepo repo;

    public void addStudent(String sName, int marks, String courseName) {
        repo.save(sName, marks, courseName);
    }



    public Page<Student> getStudentDetails(String sName,PageRequest pr) {

        return repo.findByCriteria(sName,pr);
    }


    public void deleteStudentBycourseName(String courseName) {

        repo.deleteByCourseName(courseName);
    }
}
