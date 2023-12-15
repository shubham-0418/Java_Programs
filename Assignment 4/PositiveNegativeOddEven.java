package com.arrays;

import java.util.Scanner;

public class PositiveNegativeOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the  array element:");
		int arr[] =new int[20];
		int count=0,c=0,z=0,e=0,o=0,i;
		for(i=0;i<20;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]>0)
				count++;
			else if(arr[i]<0)
				c++;
			else if(arr[i]==0)
				z++;
			
		}
		
		for(i=0;i<arr.length;i++)
		{
		   if(arr[i]%2==0)
				e++;
			else 
				o++;
		}
		System.out.print("Positive="+count+" Negative="+c+" Zero="+z+" Even="+e+" Odd="+o);
		
		
		

	}

}
