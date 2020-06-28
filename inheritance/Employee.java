package com.wipro.inheritance;
public class Employee extends Person{
	private double annual_salary;
	private int year_of_joining;
	private String nationalInsurance_number;
	public Employee(String name,double annual_salary,int year_of_joining,String national_insurance_number) {
		
		super(name);
		
		this.annual_salary=annual_salary;
		this.year_of_joining=year_of_joining;
		this.nationalInsurance_number=national_insurance_number;
	
	}
	public double getAnnualSalary() {
		return annual_salary;
	}
	public int getYearOfJoining() {
		return year_of_joining;
	}
	public String getNationalInsuranceNumber() {
		return nationalInsurance_number;
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public String  toString() {
		return "Employee [annualSalary=" + annual_salary + ", yearOfJoining=" + year_of_joining + ", nationalInsuranceNo="
				+ nationalInsurance_number + ", name=" + name + "]";
	}
}
