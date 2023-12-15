package com.arrays;

import java.util.Scanner;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the  array element:");
		int arr[] =new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		//creating new array
		int revArray[]=new int[size];
		for(int i=arr.length-1;i>=0;i--)
		{
			revArray[i]=arr[i];
			System.out.print(" "+revArray[i]);
			
		}
       
	}

}
