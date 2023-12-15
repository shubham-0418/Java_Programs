package com.exceptionHandling;
import java.util.Scanner;
class MyCalculator{
	
	public static long power(long n, long p) throws Exception {
		
		if(n<0||n<0)
		{
			throw new Exception("n or p should not be negative!");
		}
		else if(n==0||p==0)
		{
			throw new Exception("n or p should not be zero!");
		}
		else {
			return(long)Math.pow(n, p);
		}
	} 
}

public class DriverMyCalculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Numerator :");
		long n = sc.nextLong();
		System.out.println("Power :");
		long p = sc.nextLong();
		MyCalculator c = new MyCalculator();
		
		try {
			System.out.println(c.power(n, p));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
