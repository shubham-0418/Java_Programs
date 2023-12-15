/**
*	 prints "increasing" if the numbers are in increasing order, "decreasing" if the numbers are in decreasing order
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class IncreasingOrDecreasing{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3 =sc.nextInt();
		
		
		
		if(num1<num2){
			System.out.println(num3+" "+num2+" "+num1);
		}else{
			System.out.println(num3+" "+num2+" "+num1);
		}
		
		
	}
}