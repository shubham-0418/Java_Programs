/**
*	 Display a number whose digits are 2 greater than the corrosponding digits
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/
import java.util.*;
public class DigitGreaterThanTwo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		DigitGreaterThanTwo s1 = new DigitGreaterThanTwo();
		s1.GreaterthanTwo(number);
		
		
		
		}
		
		void GreaterthanTwo(int num){
			int n = num,result = 0,result1=0,resultfinal = 0,n1=0;
			
			while(n>0){
				n1 = n%10;
				n1 = n1 + 2;
				if(n1>9){
					n1 = n1%10;
					result = (result*10) + (n1);
					n = n/10;
				}else{
				result = (result*10) + (n1);
				n = n/10;
				}
				
			}
			
			while(result>0){
				result1 = result%10;
				result1 = result1;
				if(result1>9){
					result1 = result1%10;
					resultfinal = (resultfinal*10) + (result1);
					result = result/10;
				}else{
					resultfinal = (resultfinal*10) + (result1);
					result = result/10;
				}
				
				
		}
			
			System.out.println(resultfinal);
		
			
		}
		
	}
