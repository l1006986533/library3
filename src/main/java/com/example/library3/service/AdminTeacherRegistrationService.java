package com.example.library3.service;

import com.example.library3.dto.TeacherDTO;
import com.example.library3.model.Teacher;
import com.example.library3.repository.TeacherRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AdminTeacherRegistrationService {

    @Autowired
    private TeacherRepository teacherRepository;

    public void saveTeacher(TeacherDTO teacherDTO) {
        // Logic to convert TeacherDTO to Teacher entity and save it
        Teacher teacher = new Teacher();
        teacher.setUsername(teacherDTO.getUsername());
        teacher.setPassword(teacherDTO.getPassword()); //sensitive
        teacher.setRole(teacherDTO.getRole());
        teacherRepository.save(teacher);
    }
}