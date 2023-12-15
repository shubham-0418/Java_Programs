/**
*	 print the net bonus amount. 
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class CalculateBonus{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int salary =sc.nextInt();
		int year =sc.nextInt();
		
		
		
		
		if(year>5){
			System.out.println((salary/100)*5);
		}else{
			System.out.println(salary);
		}
		
		
	}
}