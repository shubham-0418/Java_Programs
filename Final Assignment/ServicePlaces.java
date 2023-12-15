/**
*	 print their place of service. 
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class ServicePlaces{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int age =sc.nextInt();
		Char c = sc.nextChar();
				
		if(c.equalsIgnoreCase('f')){
			System.out.println("Urban Area");
		}else if(age>40 && age<60){
			System.out.println("urban areas only");
		}else if(age>20 && age<40){
			System.out.println("Anywhere");
		}else{
			System.out.println("ERROR");
		}
		
		
	}
}