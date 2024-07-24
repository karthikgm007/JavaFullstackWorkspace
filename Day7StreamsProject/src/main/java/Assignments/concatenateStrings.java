package Assignments;



import java.util.Arrays;
import java.util.List;

public class concatenateStrings {
public static void main(String[] args) {
	
	List<String> list =Arrays.asList("Hello ","this ","is ","concatenating ","Strings ");
	
	System.out.println(list.stream().reduce("",(a,b)->a+b));
}
}