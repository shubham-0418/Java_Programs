package com.arrays;
import java.util.*;
import java.util.Arrays;

public class ReplaceArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the Array Element:");
		 int arr[]=new int[10];
		 int i;
		 for(i=0;i<arr.length;i++)
		 {
		   arr[i]=sc.nextInt();
		   
			   
		   
		 }
		 System.out.println("Befor Rplacing Array:"+Arrays.toString(arr));

	   for(i=0;i<arr.length;i++)
		 {
		   if(arr[i]%9==0)
		   {
			   arr[i]=4;
		   }
		   else if(arr[i]%8==0)
		   {
			  arr[i]=2; 
		   }

		   else if(arr[i]%10==3)
		   {
			  arr[i]=3; 
		   }
		   else if(arr[i]%2!=0)
		   {
			  arr[i]=1; 
		   }
		   else 
		   {
			  arr[i]=0; 
		   }
		   
		 }
		 System.out.println("After Replacing array element:"+Arrays.toString(arr));

	}

}
