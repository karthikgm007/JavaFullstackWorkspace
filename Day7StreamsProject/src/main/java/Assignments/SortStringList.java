package Assignments;


import java.util.ArrayList;
import java.util.List;

public class SortStringList {
	
public static void main(String[] args) {
	
	List<String> names=new ArrayList<String>();
	names.add("Johnn");
	names.add("Municn");
	names.add("Main");
	names.add("Abhi");
	names.add("Kabhi");
	names.add("Jabhi");
	names.add("Vbhi");
	names.add("Rabhi");
	names.add("Tabhi");
	
	names.stream().sorted().forEach(System.out::println);
}
}