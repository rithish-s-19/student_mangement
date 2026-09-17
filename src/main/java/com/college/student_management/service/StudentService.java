package com.college.student_management.service;

import com.college.student_management.entity.Student;
import com.college.student_management.repository.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    //DAY 1

    // public String getStudents() {
    //     return "List of students";
    // }

    // public String createStudent() {
    //     return "Student added successfully";
    // }

    //DAY 2

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
}
