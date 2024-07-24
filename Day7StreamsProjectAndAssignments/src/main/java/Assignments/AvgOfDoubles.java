package Assignments;

import java.util.Arrays;
import java.util.List;

public class AvgOfDoubles extends Thread {
public static void main(String[] args) {
	
	List<Double> doubles = Arrays.asList(23.3,42.50,532.5,5.2,124.0,5.12,11.35);
	
	System.out.println(doubles.stream().mapToDouble(i->i).average());
	
}
  }


