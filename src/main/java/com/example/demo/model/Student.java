package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "students")
@Data
@ToString
public class Student {

	@Id
	int studentId;
	
	String studentName;
	
	String subject;
	
	String fileName;
}
