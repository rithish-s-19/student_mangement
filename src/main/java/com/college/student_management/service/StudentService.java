package com.college.student_management.service;

import java.util.List;

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



    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


     public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = studentRepository.findById(id).orElse(null);
        if (existingStudent != null) {
            existingStudent.setName(updatedStudent.getName());
            existingStudent.setEmail(updatedStudent.getEmail());
            existingStudent.setDepartment(updatedStudent.getDepartment());
            return studentRepository.save(existingStudent);
        }
        return null;
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

}
