package com.graymatter;

import java.time.LocalDate;
import java.util.Date;

public class Student {

	private int id;
	private String name;
	private LocalDate dob;
	
	
	
	public Student() {
		super();
	}
	public Student(int id, String name, LocalDate dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	
	
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	
	
	
	
	
	
}
