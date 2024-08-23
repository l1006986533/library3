package com.example.library3.service;

import com.example.library3.dto.UserRoleDTO;
import com.example.library3.model.User;
import com.example.library3.repository.UserRepository;
import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AdminLoginService {

    @Autowired
    private UserRepository userRepository;

    public UserRoleDTO authenticateAdmin(String username, String password) { //sensitive
        Optional<User> userOptional = userRepository.findByUsername(username);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            if (user.getPassword().equals(password)) { //sensitive
                return new UserRoleDTO(user.getRole(), "/admin/dashboard"); // Example redirect URL
            }
        }
        return new UserRoleDTO("", ""); // Return empty DTO if authentication fails
    }
}