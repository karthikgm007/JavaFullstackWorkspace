package com.ClassWork;


import java.util.Arrays;

public class School {
private String schoolName;
private String address;
ClassRoom []cr;
public School() {
	super();
}
public School(String schoolName, String address) {
	super();
	this.schoolName = schoolName;
	this.address = address;
	ClassRoom []cr=new ClassRoom[2];
	cr[0]=new ClassRoom(3,5);
	cr[1]=new ClassRoom(5,1);
	this.cr = cr;
}
@Override
public String toString() {
	return "School [schoolName=" + schoolName + ", address=" + address + ", cr=" + Arrays.toString(cr) + "]";
}


}
