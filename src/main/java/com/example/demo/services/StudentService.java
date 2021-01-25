package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.example.demo.models.Student;

@Service
public class StudentService {

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<Student>();

		// Generating student list
		for (int i = 0; i < 15; i++) {
			students.add(new Student(i, "Student : " + i, i + 35));
		}

		return students;
	}

}
