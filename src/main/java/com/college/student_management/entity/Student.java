package com.college.student_management.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
//Tell JPA that student is a database entity
@Table(name = "students")
//specifies that the database table should be called students
public class Student {

    @Id 
    //Marks id as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Tells JPA/databases to generate the ID automatically.
    private Long id;

    private String name;
    private String email;
    private String department;

    //JPA needs a no-argument constructor to create entity objects.
    public Student() {
    }

    //this makes it  convenient for our application to create a new student
    public Student(String name, String email, String department) {
        this.name = name;
        this.email = email;
        this.department = department;
    }

    // Getters and Setters
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}