/**
*	 print the number from 1 to 20 except the given number
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class whileNotZero{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum =0;
		while(true){
			int emma = sc.nextInt();
			sum = sum + emma;
			if(emma == 0){
				break;
			}
			
		}
		System.out.println(sum);
		
	}
}