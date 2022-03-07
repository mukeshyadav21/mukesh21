package com.mk.sageit.coding;

public abstract class Employee {
	
	public abstract void setSalary(int salary);

    public abstract int  getSalary();

    public abstract void setGrade(String grade);

    public abstract String  getGrade();

     void data(String grade,int salary)
    {
        System.out.println("Employee's data :::" +" Grade= " +grade+ " Salary= "+salary);
    }
}


