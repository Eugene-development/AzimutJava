package com.example.api.students;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService<StudentRepositri> {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> list() {
        return studentRepository.findAll();
    }

    public void add(Student student) {
        studentRepository.save(student);
    }
}
