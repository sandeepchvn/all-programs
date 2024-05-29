package com.lamda.school_student;

import java.util.List;
import java.util.Objects;


public class School {

	private int id;
	private String name;
	private List<Student> students;

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

	public School(int id, String name, List<Student> students) {
		super();
		this.id = id;
		this.name = name;
		this.students = students;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", students=" + students + "]";
	}

	@Override
	public int hashCode() {
		return id+name.hashCode()+students.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		School sc = (School) obj;
		return this.getId() == sc.getId() && this.getName() == sc.getName() && sc.getStudents() == this.getStudents();
	}

}
