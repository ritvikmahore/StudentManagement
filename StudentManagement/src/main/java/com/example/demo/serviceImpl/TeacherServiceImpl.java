package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Teacher;
import com.example.demo.repo.TeacherRepo;
import com.example.demo.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService{
	@Autowired
	TeacherRepo tr;

	@Override
	public void saveTeacher(Teacher t) {
		tr.save(t);
		
	}

}
