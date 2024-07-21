	package Assignments;
	
	public class Car {
	private String name;
	private String model;
	private String brand;
	private String color;
	Engine e;
	public Car() {
		super();
	}
	public Car(String name, String model, String brand, String color) {
		super();
		this.name = name;
		this.model = model;
		this.brand = brand;
		this.color = color;
		
		Engine e=new Engine("Honda",4);
		this.e=e;	
	}
	
	
	
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", brand=" + brand + ", color=" + color + ", e=" + e + "]";
	}
	
	
	}