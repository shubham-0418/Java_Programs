/**
*	 Check check if it is square or not.
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class IsSquare{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int length =sc.nextInt();
		int breadth = sc.nextInt();
		
		if(length == breadth){
			System.out.println("Square");
		}else{
			System.out.println("Not a Square");
		}
		
		
	}
}