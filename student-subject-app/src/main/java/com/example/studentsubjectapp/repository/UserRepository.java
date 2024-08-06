package com.example.studentsubjectapp.repository;

import com.example.studentsubjectapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
