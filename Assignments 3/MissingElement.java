/**
*	 print the missing elements of array
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 25/7/2023
*/

import java.util.*;
public class MissingElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr=new int[n-1];
		
		for(int i=0;i<n-1;i++){
			arr[i] = sc.nextInt();
		}
		
		
		
		System.out.println(position(n,arr));
		
	}
	
	static int position(int n,int[] arr1)
	{
		int natural = (n*(n+1))/2;
		for(int num : arr1){
			natural = natural - num;
		}
		return natural;
	}
	
	
}