package com.classWork;

public class MainShape {

	public static void main(String[] args) {

		Shape s = new Shape();
		s.getArea();
		s.getPerimeter();
		
		Square sq =  new Square();
		sq.getArea();
		sq.getPerimeter();
		
		
		Circle c = new Circle();
		c.getArea();
		c.getPerimeter();
		
		Shape s1 = new Square(6);
		s1.getArea();  //square method called
		s1 = new Circle(6);
		s1.getArea();  // circle method called
		
	}

}
