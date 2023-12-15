package com.inheritancPolymorphism;


 class Circle
{
	private double radius=1.0;
	private String color="red";
	
	public Circle()
	{
		
	}
	public Circle(double radius)
	{
		this.radius=radius;
		
	}
	public Circle(double radius,String color)
	{
		this.radius=radius;
		this.color=color;
		
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	

	public String toString()
	{
		return "Circle[radius="+radius+", color="+color+"]";
	}
	
	public double getArea()
	{
		return (3.14*radius*radius);
	}
}

class Cylinder extends Circle
{
	private double height=1.0;
	
	//Default Constructor
	public Cylinder()
	{
		
	}
	//Parametarized Constructor
	public Cylinder(double radius)
	{
		super(radius);
	}
	
	//Parametarized Constructor
		public Cylinder(double radius,double height)
		{
			super(radius);
			this.height=height;
		}
		
		//Parametarized Constructor
		public Cylinder(double radius,double height,String color)
		{
			super(radius,color);
			this.height=height;
			
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			this.height = height;
		}
		
		double getVolume()
		{
			return 3.14*getRadius()*getRadius()*getHeight();
		}
}


public class DriverSingleLevelInheritance {
	public static void main(String args[])
	{
		Cylinder c=new Cylinder(5,8);
		System.out.println("Volume of Cylinder="+c.getVolume());
		System.out.println("ToString Method="+c.toString());
		
	}

}
