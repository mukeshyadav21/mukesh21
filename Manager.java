package com.mk.sageit.coding;

public class Manager extends Employee{
	private int salary;
	private String grade;

	@Override
	public void setSalary(int salary) {
		this.salary=salary;
	}

	@Override
	public int getSalary() {
		return salary;
	}

	@Override
	public void setGrade(String grade) {
		this.grade=grade;
		
	}

	@Override
	public String getGrade() {
		return grade;
	}
   public static void main(String[] args) {
	Manager m1=new Manager();
	m1.data( " Grade A ",7000);
}
}
