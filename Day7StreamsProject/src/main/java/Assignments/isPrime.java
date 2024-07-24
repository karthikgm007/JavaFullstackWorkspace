package Assignments;

import java.util.Arrays;
import java.util.List;

public class isPrime {
	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(3,5,9,11,13,14,17,52,61,73);
		li.stream().filter(i -> Prime.isPrime(i)).forEach(System.out::println);
}
}