package com.arrays;
import java.util.*;
public class AvgScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc =new Scanner(System.in);
		 System.out.println("Enter the Marks of Student:");
		 int arr[]=new int[10];
		 int sum=0,avg;
		 int i;
		 for(i=0;i<arr.length;i++)
		 {
		   arr[i]=sc.nextInt();
		   sum=sum+arr[i];
		   
		 }
		 avg=sum/arr.length-1;
		 for(i=0;i<arr.length;i++)
		 {
		 if(arr[i]<avg)
		 {
		  System.out.print(i+" ");
		 }
		 }

	}

}
