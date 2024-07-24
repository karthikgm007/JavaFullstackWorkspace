package com.graymatter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Employee implements Comparable{

	private String empName;
	private int empId;
	private double empSal;
	private String city;
	
	
	//Implementing comparable interface for sort 
	public int compareTo(Object o) {

		Employee e = new Employee();
		e = (Employee) o;
		
		//Comparison on id
		//return this.getEmpId() -e.getEmpId() ;
		
		//comparison based on name
		//return this.getEmpName().compareTo(e.getEmpName());
		
		//based on salary
		return (int)this.getEmpSal()-e.getEmpId();

	}

//	OR
//	@Override
//	public int compareTo(Object o) {
//		// TODO Auto-generated method stub
//		return (int)this.getEmpSal()-((Employee) o).getEmpId();
//	}
	
}
