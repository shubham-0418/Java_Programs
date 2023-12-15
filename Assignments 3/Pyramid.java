/**
*	 print pyramid pattern
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class Pyramid{
	public static void main(String[] args){
		int n =5;
		
		for(int i=1;i<=n;i++){
			
			for(int k =1;k<n-i+1; k++){
				System.out.print(" ");
			}
			
			for(int j = 1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
	
}