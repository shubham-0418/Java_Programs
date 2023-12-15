package com.arrays;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the  array element:");
		int arr[] =new int[5];
		int i,flag=0;
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();

		}
		
		
		for(i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{	
				if(arr[i]==arr[j]) {
					System.out.print(arr[i]+" ");
					flag++;
				}
					
					
			}
		
		}
		
		if(flag == 0) {
			System.out.println("-1");
		}
		 
			
	}

}
