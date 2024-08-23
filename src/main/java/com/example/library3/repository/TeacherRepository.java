package com.example.library3.repository;

import com.example.library3.model.Teacher;
import com.example.library3.model.User;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class TeacherRepository {

    public Optional<User> findByUsername(String username) {
        // Implementation to find a user by username from the database
        return Optional.empty(); // Placeholder return statement
    }
    public void save(Teacher teacher) {
        //add by human
    }
}