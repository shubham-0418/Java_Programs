package com.arrays;
import java.util.*;
public class SumAvgProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array Element");
		int arr[] =new int[5];
		int sum=0,product=1,avg=0;
		
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			avg=sum/arr.length-1;
			product=product*arr[i];
		}
		
		System.out.println(sum+" "+avg+" "+product);

	}

}
