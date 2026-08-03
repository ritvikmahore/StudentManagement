package com.example.demo.controller;

import java.net.ResponseCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService ss;

@PostMapping("addStudent")
ResponseEntity addStudent(@RequestBody StudentDto sd) {
	
	ss.saveStudent(sd);
	return new ResponseEntity(HttpStatus.CREATED);
			
	
	
	
}
}
