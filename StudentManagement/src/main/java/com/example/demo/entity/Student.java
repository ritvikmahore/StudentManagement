package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String address;
@ManyToMany(mappedBy = "students")
private List<Teacher>teachers;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public List<Teacher> getTeachers() {
	return teachers;
}
public void setTeachers(List<Teacher> teachers) {
	this.teachers = teachers;
}
public Student(String name, String address, List<Teacher> teachers) {

	this.name = name;
	this.address = address;
	this.teachers = teachers;
}
public Student() {
	// TODO Auto-generated constructor stub
}



}
