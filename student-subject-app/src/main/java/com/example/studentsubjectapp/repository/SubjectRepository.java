package com.example.studentsubjectapp.repository;

import com.example.studentsubjectapp.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
