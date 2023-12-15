package com.inheritance;

class Employeesal{
	private int id = 12345;
	private String name = "Shubham";
	
	public double calculateYearlySalary(double sal) {
		return sal*12;
	}
	
	public double calculateYearlySalary(double sal,int days) {
		return sal*days;
	}
	
	public double calculateYearlySalary(double sal,double hours) {
		return (sal*hours)*250;
	}
	
	public String toString() {
		return "Id :"+id+"\nName :"+name+"\nSalary :"+calculateYearlySalary(200000);
	}
	
}
public class EmployeeSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employeesal emp = new Employeesal();
		System.out.println("Yearly Salary based of on Monthly Salary " + emp.calculateYearlySalary(200000));
		System.out.println("Yearly Salary based of on Daily Salary " + emp.calculateYearlySalary(9600.0,250));
		System.out.println("Yearly Salary based of on Hourly Salary " + emp.calculateYearlySalary(1129.3,8.5));
		System.out.println(emp);
	}

}
