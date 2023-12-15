/**
*	 Print maximum and minimun number from enered numbers
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class MinMaxUserInput{
	public static void main(String[] args){
		
		MinMaxUserInput obj = new MinMaxUserInput();
		obj.minMax();
		
	}
	
	void minMax(){
		Scanner sc = new Scanner(System.in);
		int min=100,max=0;
		while(true){
			int minmax = sc.nextInt();
			
			if(minmax < 0){
				break;
			}
			
			if(minmax>max ){
				max = minmax;
			}
			
			if(minmax < min ){
				min = minmax;
			}
			
			
			
		}
		
		System.out.println(max + " " + min);
		
	}
}