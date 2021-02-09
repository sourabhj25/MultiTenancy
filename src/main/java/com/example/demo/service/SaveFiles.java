package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDAO;
import com.example.demo.model.Student;

@Service
public class SaveFiles {
	
	@Autowired
	StudentDAO studentDAO;
	
	public void saveStudentFile(String fileName) {
		Optional<Student> existingStudent = studentDAO.findById(1);
		existingStudent.get().setFileName(fileName);
		studentDAO.save(existingStudent.get());
	}
	
}
