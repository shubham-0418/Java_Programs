package com.classobjects;

public class TesterCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c=new Circle();
		
		//one argument constructor
		System.out.println("One argument Constructor..");
		Circle c1=new Circle();
		System.out.println(c1.toString());
		System.out.println("Area = "+c1.getArea());
		
		//two argument constructor
		System.out.println("One argument Constructor..");
		Circle c2=new Circle(6.0,"Pink");
		System.out.println(c2.toString());
		System.out.println("Area = "+c1.getArea());
		
		//Setting radius
		System.out.println("Setting the radius by using setRadius() method..");
		c1.setRadius(8.0);
		System.out.println(c1.getRadius());
		
		
		//Setting radius and color
		System.out.println("Setting the radius and color by using setRadius() method..");
		c2.setRadius(8.0);
		c2.setColor("Blue");
		System.out.println("radius="+c2.getRadius()+"  Color="+c2.getColor());
		
		
		
		

	}

}
