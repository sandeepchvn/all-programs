package com.lamda.employee;

import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private String password;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Employee(int id, String name, String password, long phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
	}

	@Override
	public int hashCode() {
		return id + name.hashCode() + password.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		return this.getId() == employee.getId() && this.name == employee.name && this.password == employee.password;
	}

}
