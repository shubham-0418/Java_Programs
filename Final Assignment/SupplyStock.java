/**
*	 supply the available stock and inform as ‘Out of stock. Balance will be refunded’.
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class SupplyStock{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int grade =sc.nextInt();
		if(grade>90){
			System.out.println("O");
		}else if(grade<=90 && grade>=81){
			System.out.println("A");
		}else if(grade<=80 && grade>=71){
			System.out.println("B");
		}else if(grade<=70 && grade>=61){
			System.out.println("C");
		}else if(grade<=60 && grade>=51){
			System.out.println("D");
		}else if(grade<50){
			System.out.println("F");
		}		
		
		}
		
		
	}
}