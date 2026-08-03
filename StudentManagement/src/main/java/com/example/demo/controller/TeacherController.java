package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.TeacherService;

@RestController
public class TeacherController {
@Autowired
TeacherService ts;

@PostMapping("addT")
ResponseEntity addTeacher(@RequestBody Teacher t) {
	
	ts.saveTeacher(t);
	return new ResponseEntity(HttpStatus.CREATED);
	
}


}
