/**
*	 calculate the total expenses
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class TotalExpenses{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count =sc.nextInt();
		double price =sc.nextDouble();
		
		
		if(count>1000){
			double discount = ((count*price)*90)/100;
			System.out.println(discount);
		}else{
			System.out.println(count*price);
		}
		
		
	}
}