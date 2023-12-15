package com.arrays;

import java.util.Scanner;

public class SearchArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the Size of arr:");
		 int size=sc.nextInt();
		 System.out.println("Enter the array element:");
		 
		 int arr[]=new int[size];
		 int i;
		 for(i=0;i<size;i++)
		 {
		   arr[i]=sc.nextInt();
		    
		 }
		 
		 System.out.println("Search Array Element:");
		 int n=sc.nextInt();
		 int count=0;
		 for(i=0;i<size;i++)
		 {
		   if(arr[i]==n)
		   {
			   count++;
		   }
		    
		 }
		 System.out.println("No of Times="+count);
		 
	}

}
