/**
*	birthright among his three sons Choi Sung, Moui Sung, and Bhoi Sung 
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class BirthRight{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int son1 =sc.nextInt();
		int son2 =sc.nextInt();
		int son3 =sc.nextInt();
		
		
		
		if(son1>son2 && son1>son3){
			System.out.println(" Choi Sung");
		}else if(son2>son3){
			System.out.println("Moui Sung");
		}else{
			System.out.println("Bhoi Sung");
		}
		
		
	}
}