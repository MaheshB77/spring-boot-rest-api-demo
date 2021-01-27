package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents() {
		return this.studentRepository.findAll();
	}
	
	public Optional<Student> getStudent(Integer studentId) {
		return this.studentRepository.findById(studentId);
	}
	
	public void addStudent(Student student) {
		this.studentRepository.save(student);
	}

}
