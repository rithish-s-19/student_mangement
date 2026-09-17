package com.college.student_management.repository;

import com.college.student_management.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository provides CRUD operations for the Student entity

}
