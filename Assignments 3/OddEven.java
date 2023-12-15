/**
*	 print even or odd till the number
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		for(int i=1;i<=number;i++){
		 if(number%2==0){
			if(i%2==0){
				System.out.print(i +" ");
			}
		 }else{
			if(i%2!=0){
				System.out.print(i +" ");
			}
		 }
		}
		
	}
}