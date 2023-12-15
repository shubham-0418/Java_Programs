/**
*	 Check check if it positive negative or zero.
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class PositiveNegativeOrZero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		
		
		if(n>0){
			System.out.println("Positive");
		}else if(n<0){
			System.out.println("Negative");
		}else{
			System.out.println("Zero");
		}
		
		
	}
}