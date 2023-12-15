/**
*	 print sum of position of odd and even
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class PositionOfOddEvenUingFunction{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		PositionOfOddEvenUingFunction s1 = new PositionOfOddEvenUingFunction();
		s1.oddEvenSum(number);
		
		
		
		}
		
		void oddEvenSum(int num){
		int even=0,odd=0;
		if(num>0 && num<9){
		System.out.println(num);

		}else{
			int count=0;
			int n = num;
			while(n>0){
				n = n / 10;
				count++;
			}
		
		
				while(num>0){
					even = even +(num%10);
					num = num /10;
					odd = odd +(num%10);
					num = num /10;
				}
				
			
			if(count%2==0){
				System.out.print(odd +" " + even);
				
			}else{
				System.out.print(even +" " + odd);
			}
			
		}
			
		}
		
	}
