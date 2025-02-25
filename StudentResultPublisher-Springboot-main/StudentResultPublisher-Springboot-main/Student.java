package com.example.StudentGrader.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String rollNumber;
    private String department;
    private String subject1Name;
    private int subject1Marks;
    private int subject1MaxMarks;
    private String subject1Grade;
    private String subject2Name;
    private int subject2Marks;
    private int subject2MaxMarks;
    private String subject2Grade;
    private String subject3Name;
    private int subject3Marks;
    private int subject3MaxMarks;
    private String subject3Grade;
    private String subject4Name;
    private int subject4Marks;
    private int subject4MaxMarks;
    private String subject4Grade;
    private String subject5Name;
    private int subject5Marks;
    private int subject5MaxMarks;
    private String subject5Grade;
    private String subject6Name;
    private int subject6Marks;
    private int subject6MaxMarks;
    private String subject6Grade;
    private String finalQualificationStatus;

    public Student() {
    }

    public Student(Long id, String name, String rollNumber, String department, String subject1Name, int subject1Marks, int subject1MaxMarks, String subject1Grade, String subject2Name, int subject2Marks, int subject2MaxMarks, String subject2Grade, String subject3Name, int subject3Marks, int subject3MaxMarks, String subject3Grade, String subject4Name, int subject4Marks, int subject4MaxMarks, String subject4Grade, String subject5Name, int subject5Marks, int subject5MaxMarks, String subject5Grade, String subject6Name, int subject6Marks, int subject6MaxMarks, String subject6Grade, String finalQualificationStatus) {
        this.id = id;
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
        this.subject1Name = subject1Name;
        this.subject1Marks = subject1Marks;
        this.subject1MaxMarks = subject1MaxMarks;
        this.subject1Grade = subject1Grade;
        this.subject2Name = subject2Name;
        this.subject2Marks = subject2Marks;
        this.subject2MaxMarks = subject2MaxMarks;
        this.subject2Grade = subject2Grade;
        this.subject3Name = subject3Name;
        this.subject3Marks = subject3Marks;
        this.subject3MaxMarks = subject3MaxMarks;
        this.subject3Grade = subject3Grade;
        this.subject4Name = subject4Name;
        this.subject4Marks = subject4Marks;
        this.subject4MaxMarks = subject4MaxMarks;
        this.subject4Grade = subject4Grade;
        this.subject5Name = subject5Name;
        this.subject5Marks = subject5Marks;
        this.subject5MaxMarks = subject5MaxMarks;
        this.subject5Grade = subject5Grade;
        this.subject6Name = subject6Name;
        this.subject6Marks = subject6Marks;
        this.subject6MaxMarks = subject6MaxMarks;
        this.subject6Grade = subject6Grade;
        this.finalQualificationStatus = finalQualificationStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubject1Name() {
        return subject1Name;
    }

    public void setSubject1Name(String subject1Name) {
        this.subject1Name = subject1Name;
    }

    public int getSubject1Marks() {
        return subject1Marks;
    }

    public void setSubject1Marks(int subject1Marks) {
        this.subject1Marks = subject1Marks;
    }

    public int getSubject1MaxMarks() {
        return subject1MaxMarks;
    }

    public void setSubject1MaxMarks(int subject1MaxMarks) {
        this.subject1MaxMarks = subject1MaxMarks;
    }

    public String getSubject1Grade() {
        return subject1Grade;
    }

    public void setSubject1Grade(String subject1Grade) {
        this.subject1Grade = subject1Grade;
    }

    public String getSubject2Name() {
        return subject2Name;
    }

    public void setSubject2Name(String subject2Name) {
        this.subject2Name = subject2Name;
    }

    public int getSubject2Marks() {
        return subject2Marks;
    }

    public void setSubject2Marks(int subject2Marks) {
        this.subject2Marks = subject2Marks;
    }

    public int getSubject2MaxMarks() {
        return subject2MaxMarks;
    }

    public void setSubject2MaxMarks(int subject2MaxMarks) {
        this.subject2MaxMarks = subject2MaxMarks;
    }

    public String getSubject2Grade() {
        return subject2Grade;
    }

    public void setSubject2Grade(String subject2Grade) {
        this.subject2Grade = subject2Grade;
    }

    public String getSubject3Name() {
        return subject3Name;
    }

    public void setSubject3Name(String subject3Name) {
        this.subject3Name = subject3Name;
    }

    public int getSubject3Marks() {
        return subject3Marks;
    }

    public void setSubject3Marks(int subject3Marks) {
        this.subject3Marks = subject3Marks;
    }

    public int getSubject3MaxMarks() {
        return subject3MaxMarks;
    }

    public void setSubject3MaxMarks(int subject3MaxMarks) {
        this.subject3MaxMarks = subject3MaxMarks;
    }

    public String getSubject3Grade() {
        return subject3Grade;
    }

    public void setSubject3Grade(String subject3Grade) {
        this.subject3Grade = subject3Grade;
    }

    public String getSubject4Name() {
        return subject4Name;
    }

    public void setSubject4Name(String subject4Name) {
        this.subject4Name = subject4Name;
    }

    public int getSubject4Marks() {
        return subject4Marks;
    }

    public void setSubject4Marks(int subject4Marks) {
        this.subject4Marks = subject4Marks;
    }

    public int getSubject4MaxMarks() {
        return subject4MaxMarks;
    }

    public void setSubject4MaxMarks(int subject4MaxMarks) {
        this.subject4MaxMarks = subject4MaxMarks;
    }

    public String getSubject4Grade() {
        return subject4Grade;
    }

    public void setSubject4Grade(String subject4Grade) {
        this.subject4Grade = subject4Grade;
    }

    public String getSubject5Name() {
        return subject5Name;
    }

    public void setSubject5Name(String subject5Name) {
        this.subject5Name = subject5Name;
    }

    public int getSubject5Marks() {
        return subject5Marks;
    }

    public void setSubject5Marks(int subject5Marks) {
        this.subject5Marks = subject5Marks;
    }

    public int getSubject5MaxMarks() {
        return subject5MaxMarks;
    }

    public void setSubject5MaxMarks(int subject5MaxMarks) {
        this.subject5MaxMarks = subject5MaxMarks;
    }

    public String getSubject5Grade() {
        return subject5Grade;
    }

    public void setSubject5Grade(String subject5Grade) {
        this.subject5Grade = subject5Grade;
    }

    public String getSubject6Name() {
        return subject6Name;
    }

    public void setSubject6Name(String subject6Name) {
        this.subject6Name = subject6Name;
    }

    public int getSubject6Marks() {
        return subject6Marks;
    }

    public void setSubject6Marks(int subject6Marks) {
        this.subject6Marks = subject6Marks;
    }

    public int getSubject6MaxMarks() {
        return subject6MaxMarks;
    }

    public void setSubject6MaxMarks(int subject6MaxMarks) {
        this.subject6MaxMarks = subject6MaxMarks;
    }

    public String getSubject6Grade() {
        return subject6Grade;
    }

    public void setSubject6Grade(String subject6Grade) {
        this.subject6Grade = subject6Grade;
    }

    public String getFinalQualificationStatus() {
        return finalQualificationStatus;
    }

    public void setFinalQualificationStatus(String finalQualificationStatus) {
        this.finalQualificationStatus = finalQualificationStatus;
    }
}
