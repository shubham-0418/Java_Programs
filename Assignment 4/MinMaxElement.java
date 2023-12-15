package com.arrays;

import java.util.Scanner;

public class MinMaxElement {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of array:");
		int size=sc.nextInt();
		System.out.println("Enter the  array element:");
		int arr[] =new int[size];
		int min,max;
		
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(min>arr[i])
			{
				min=arr[i];
			}
			
			
		}
		
		//System.out.println(min);
		
		max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(max<arr[i])
			{
				max=arr[i];
			}
			
			
		}
		
		System.out.print(min+" "+max);
	}

}
