package com.javafundas;

import java.util.Scanner;

public class PositiveBeforeNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos;
		Scanner sc =new Scanner(System.in);

        System.out.println("Enter the Size of arr:");
        int size=sc.nextInt();
        pos = size-1;

        System.out.println("Enter the Array Element:");
        int arr[]=new int[size];

        for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
        
        

        for(int i=size-2;i>=0;i--)
        {    
        	if(arr[pos]<0) {
        		pos--;
        	}
        	if(arr[i]<0 && arr[pos]>0) {
        		int temp = arr[i];
        		
        		for(int j = i;j<=pos-1;j++) {
        			arr[j] = arr[j+1];
        		}
        		
        		arr[pos] = temp;
        		pos--;
        	}
        	
        	
        }
        
        
        for(int i=0;i<size;i++)
        {
          System.out.print(arr[i]+" ");
        }

   }
}


