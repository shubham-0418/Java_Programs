/**
*	 print the position of the specific customer
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class PositionOfCustomer{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String[] arr=new String[n];
		
		for(int i=0;i<n;i++){
			arr[i] = sc.next();
		}
		
		String s = sc.next();
		
		System.out.println(position(n,arr,s));
		
	}
	
	static int position(int n,String[] str,String name)
	{
		for(int i=0;i<n;i++){
			if(name.equalsIgnoreCase(str[i])){
				return(i+1);
			}
		}
		return -1;
	}
	
	
}