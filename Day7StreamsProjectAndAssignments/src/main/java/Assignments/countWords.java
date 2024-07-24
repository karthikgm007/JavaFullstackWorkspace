package Assignments;

import java.util.Arrays;

public class countWords {
public static void main(String[] args) {
	
	String para ="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. ";
	
   System.out.println(Arrays.stream(para.split("\\s+")).count());
}
}