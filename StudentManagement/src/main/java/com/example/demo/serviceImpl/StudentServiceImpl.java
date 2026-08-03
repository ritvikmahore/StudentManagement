package com.example.demo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.StudentDto;
import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.repo.StudentRepo;
import com.example.demo.repo.TeacherRepo;
import com.example.demo.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo sr;
	@Autowired
	TeacherRepo tr;
	

	@Override
	public void saveStudent(StudentDto sd) {
		
	Teacher t=	tr.findById(sd.getTeacherId()).get();
	
	List<Teacher>tl=new ArrayList<>();
	tl.add(t);
		
		Student s= new Student(sd.getName(), sd.getAddress(), tl);
		
sr.save(s);
		
	}

}
