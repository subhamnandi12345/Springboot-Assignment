package com.example.studentsubjectapp.repository;

import com.example.studentsubjectapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
