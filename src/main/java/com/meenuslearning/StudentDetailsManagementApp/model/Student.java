package com.meenuslearning.StudentDetailsManagementApp.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;

@Entity
@Data
@Table(name="student")
public class Student {
    @GeneratedValue(strategy= GenerationType.IDENTITY)
@Id
@Column(name="id")
private int id;
@Column(name="name")
private String sName;
@Column(name="marks")
private int marks;
@Column(name="course_name")
private String courseName;

    public Student() {
    }

    public Student(int id, String sName, int marks, String courseName) {
        this.id = id;
        this.sName = sName;
        this.marks = marks;
        this.courseName = courseName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", marks=" + marks +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
