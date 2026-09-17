package com.college.student_management.controller;

import com.college.student_management.entity.Student;
import com.college.student_management.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



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

        // @GetMapping("/addtwoint")
        // public int addTwoInt() {
        //     return 1+2;
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

    //GET ALL STUDENTS
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    //GET STUDENT BY ID
    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }


    //UPDATE STUDENT
    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    //DELETE STUDENT
    @DeleteMapping ("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
    }
    


}
