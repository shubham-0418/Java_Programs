/**
*	 print sum of position of odd and even
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class PositionOfOddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int even=0,odd=0;
		
		if(number>0 && number<9){
			System.out.println(number);

		}else{
			int count=0;
			int n = number;
			while(n>0){
				n = n / 10;
				count++;
			}
			
			/*
			if(count%2==0){
				while(number>0){
					even = even +(number%10);
					number = number /10;
					odd = odd +(number%10);
					number = number /10;
				}
				
			}else{
				while(number>0){
					odd = odd +(number%10);
					number = number /10;
					even = even +(number%10);
					number = number /10;
				}
				
			}
			*/
			
		
				while(number>0){
					even = even +(number%10);
					number = number /10;
					odd = odd +(number%10);
					number = number /10;
				}
				
			
			if(count%2==0){
				System.out.print(odd +" " + even);
				
			}else{
				System.out.print(even +" " + odd);
			}
			
		}
		
		}
		
	}
