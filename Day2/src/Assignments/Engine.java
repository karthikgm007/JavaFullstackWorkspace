package Assignments;

public class Engine extends Car{
	private String company;
	private int noOfCylinders;
	
	public Engine() {
		super();
	}
	public Engine(String company, int noOfCylinders) {
		super();
		this.company = company;
		this.noOfCylinders = noOfCylinders;
	}
	@Override
	public String toString() {
		return "Engine [company=" + company + ", noOfCylinders=" + noOfCylinders + "]";
	}

}