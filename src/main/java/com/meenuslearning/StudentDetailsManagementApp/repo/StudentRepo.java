package com.meenuslearning.StudentDetailsManagementApp.repo;

import com.meenuslearning.StudentDetailsManagementApp.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface StudentRepo extends PagingAndSortingRepository<Student,Integer> {

    @Modifying
    @Transactional
//    @Query(value = "INSERT INTO student (sName,marks,courseName ) VALUES (:sName, :marks,:courseName)", nativeQuery = true)
    void save(Student student);
    @Query("SELECT s FROM Student s WHERE s.sName = :sName ")
    Page<Student> findByCriteria(@Param("sName") String sName, PageRequest pr);

    @Modifying
    @Transactional
    @Query( "DELETE  FROM Student s WHERE s.courseName = :courseName ")
    void deleteByCourseName(String courseName);
}
