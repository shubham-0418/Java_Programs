package com.oop;

public class Circle {
	
	private double radius = 1.0;
	private String color = "red";
	
	//Default Constructor
	public Circle() {
		
		
	}
	
	//single parameter constructor
	public Circle(double radius) {
		this.radius = radius;
	}

	//double parameter constructor
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	//getter
	public double getRadius() {
		return radius;
	}

	//setter
	public void setRadius(double radius) {
		this.radius = radius;
	}

	//getter
	public String getColor() {
		return color;
	}

	//setter
	public void setColor(String color) {
		this.color = color;
	}
	
	//to String method
	public String toString() {
		return "Radius : "+radius 
				+" Colour : "+color;
	}
	
	//get Area method
	public double getArea() {
		return 3.14*radius*radius;
	}
}
