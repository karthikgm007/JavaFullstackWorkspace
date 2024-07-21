package Assignments;

public class Student {

	//POJO class(plain old java class) = class without main method* + Getters, setters, to String, Constructors
	//else driver class.
	
	private String studName;
	private int id;
	private int m1, m2, m3;
	
	//no param constructor
	public Student() {
		super();	//constructor of parent class(Object class here) is invoked(optional)
	}
	//all param constructor
	public Student(String studName, int id, int m1, int m2, int m3) {
		super();
		this.studName = studName;
		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	//two param constructor
	public Student(String studName, int id) {
		super();
		this.studName = studName;
		this.id = id;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}
	
	//Object class method
	@Override
	public String toString() {
		return "Student [studName=" + studName + ", id=" + id + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}
	
	public String getResults() {
		
		String res;
		float avg = this.getAvg();
		
		if(avg>60) return "firstclass";
		else if(avg>50) return "second class";
		else if(avg>30) return "third class";
		else return "Fail";
	}	
	
	private float getAvg() {
		
		float avg = (this.getM1() + this.getM2() + this.getM3())/3;
		return avg;
	}

	
	
}
