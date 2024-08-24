package com.meenuslearning.StudentDetailsManagementApp.repo;

import com.meenuslearning.StudentDetailsManagementApp.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student,Integer> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO student (sName,marks,courseName ) VALUES (:sName, :marks,:courseName)", nativeQuery = true)
    void save(@Param("sName") String sName, @Param("marks") int marks,@Param("courseName")String courseName);
    @Query("SELECT s FROM Student s WHERE s.sName = :sName ")
    List<Student> findByCriteria(@Param("sName") String sName);






}
