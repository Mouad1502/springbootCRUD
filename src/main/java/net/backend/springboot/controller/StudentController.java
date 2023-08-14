package net.backend.springboot.controller;

import net.backend.springboot.model.Student;
import net.backend.springboot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
