package Assignments;

public class Prime{
	public static boolean isPrime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++)
			if(n%i==0)
				return false;
		return true;
	}
}