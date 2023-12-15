/**
*	 print the number from 1 to 20 except the given number
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class Skip{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<=20;i++){
			if(number == i){
				continue;
			}else if(number>20){
				System.out.print("Invalid Input");
				break;
				
			}
			System.out.print(i +" ");
		}
		
	}
}