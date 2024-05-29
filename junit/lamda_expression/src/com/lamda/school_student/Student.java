package com.lamda.school_student;

import java.util.Objects;

public class Student {

	private int id;
	private String name;
	private long phone;

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return id+name.hashCode();
	}

	public Student(int id, String name, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.id==student.id && this.name==student.name && this.phone==student.phone;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}

}
