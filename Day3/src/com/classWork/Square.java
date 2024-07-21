package com.classWork;

public class Square extends Shape {
	double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public Square() {
		super();
	}
	
	public void getArea() {
		System.out.println(side*side);
	}
	
	public void getPerimeter() {
		System.out.println(4*side);
	}
	
}
