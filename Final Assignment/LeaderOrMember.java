/**
*	 Find group leader or a group member. 
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

import java.util.*;
public class LeaderOrMember{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int group =sc.nextInt();
				
		if(group%10==0){
			System.out.println(" Group Leader");
		}else{
			System.out.println(" Group Member");
		}
		
		
	}
}