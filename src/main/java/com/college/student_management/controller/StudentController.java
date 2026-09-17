package com.college.student_management.controller;

import com.college.student_management.entity.Student;
import com.college.student_management.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    // DAY 1

    // private final StudentService studentService;

    // public StudentController(StudentService studentService) {
    //     this.studentService = studentService;
    // }

    // @GetMapping("/")
    // public String home() {
    //     return "Student Management API is running. Open /hello to test the application.";
    // }

    // @GetMapping("/hello")
    // public String hello() {
    //     return "Successful";
    // }

    // @PostMapping("/students")
    // public Student createStudent(@RequestBody Student student) {
    //     return studentService.createStudent(student);
    // }


    //DAY 2

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }
}
