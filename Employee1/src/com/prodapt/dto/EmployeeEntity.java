package com.prodapt.dto;

public class EmployeeEntity {
	
	private int id;
	private String name;
	private int age;
	private int salary;
	private String designation;
	
	public EmployeeEntity() {	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + ", designation="
				+ designation + "]";
	}
	
	

}