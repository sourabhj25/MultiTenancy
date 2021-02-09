package com.example.demo.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.model.Employee;
import com.example.demo.service.SaveFiles;

@RestController
public class EmployeeController {

	@Autowired
    private EmployeeDAO employeeDAO;
	
	@Autowired
	SaveFiles saveFiles;

    @RequestMapping(value = "emploeeList")
    public java.util.List<Employee> emploeeList() {
        return employeeDAO.findAll();
    }
    
    @RequestMapping(value = "uploadFile", method = RequestMethod.POST, consumes = {"multipart/form-data" })
    public String uploadFile(@RequestParam("file")MultipartFile file) {
    	
    	String msg = "";
    	if(file.isEmpty()) {
    		msg = "Please select the file to upload";
    	}
    	
    	try {

            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get("C:/Users/agsuser/Desktop/test/fileUplaod/" + file.getOriginalFilename());
            Files.write(path, bytes);
            
            saveFiles.saveStudentFile(file.getOriginalFilename());

            msg = "File uploaded";

        } catch (IOException e) {
            e.printStackTrace();
        }
        return msg;
    }
}
