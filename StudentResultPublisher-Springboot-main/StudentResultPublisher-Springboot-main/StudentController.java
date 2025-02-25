package com.example.StudentGrader.controller;

import com.example.StudentGrader.Repository.StudentRepository;
import com.example.StudentGrader.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/studentEntry")
    public ResponseEntity<Map<String, String>> addStudent(@RequestBody Student student) {
        Student savedStudent = studentRepository.save(student);
        Map<String, String> response = new HashMap<>();
        response.put("Status", "Student Added");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/viewStudents")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> students = studentRepository.findAll();
        return ResponseEntity.ok(students);
    }

    @Transactional
    @PutMapping("/calculateGrades")
    public ResponseEntity<Map<String, String>> calculateGrades() {
        List<Student> students = studentRepository.findAll();
        for (Student s : students) {
            s.setSubject1Grade(calcGrade(s.getSubject1Marks(), s.getSubject1MaxMarks()));
            s.setSubject2Grade(calcGrade(s.getSubject2Marks(), s.getSubject2MaxMarks()));
            s.setSubject3Grade(calcGrade(s.getSubject3Marks(), s.getSubject3MaxMarks()));
            s.setSubject4Grade(calcGrade(s.getSubject4Marks(), s.getSubject4MaxMarks()));
            s.setSubject5Grade(calcGrade(s.getSubject5Marks(), s.getSubject5MaxMarks()));
            s.setSubject6Grade(calcGrade(s.getSubject6Marks(), s.getSubject6MaxMarks()));
            boolean failed = s.getSubject1Grade().equals("F") || s.getSubject2Grade().equals("F") || s.getSubject3Grade().equals("F") || s.getSubject4Grade().equals("F") || s.getSubject5Grade().equals("F") || s.getSubject6Grade().equals("F");
            s.setFinalQualificationStatus(failed ? "Failed" : "Passed");
            studentRepository.save(s);
        }
        Map<String, String> response = new HashMap<>();
        response.put("Status", "Grades Calculated and Updated");
        return ResponseEntity.ok(response);
    }

    private String calcGrade(int marks, int maxMarks) {
        double percentage = ((double) marks / maxMarks) * 100;
        if (percentage >= 90) return "S";
        if (percentage >= 85) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 75) return "B+";
        if (percentage >= 70) return "B";
        if (percentage >= 65) return "C+";
        if (percentage >= 60) return "C";
        if (percentage >= 55) return "D+";
        if (percentage >= 50) return "D";
        return "F";
    }
}
