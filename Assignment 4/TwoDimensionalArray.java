/*
*	 Delete an element at the specifies position
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/

package Assignment_4;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row,column,minrow,maxrow,mincolumn,maxcolumn;
		System.out.println("Enter row size");
		row = sc.nextInt();
		System.out.println("Enter column size");
		column= sc.nextInt();
		
		int[][] arr = new int[row][column];
		System.out.println("Enter " +row +" * "+column +" Array Elements");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		//minrow = arr[0][0];
		maxrow = arr[0][0];
		maxcolumn = arr[0][0];
		mincolumn = arr[0][0];
		
		for(int i=0;i<row;i++) {
			int j=0;
			minrow = arr[i][0];
			
			
			for(j=0;j<column;j++) {
				mincolumn = arr[0][i];
				if(maxrow<arr[i][j]) {
					maxrow = arr[i][j];
				}
				if(minrow>arr[i][j]) {
					minrow = arr[i][j];
				}
				
				if(maxcolumn<arr[j][i]) {
					maxcolumn = arr[j][i];
				}
				if(mincolumn>arr[j][i]) {
					mincolumn = arr[j][i];
				}
				
			}
			
			
			
			
			System.out.println("Minimum and Maximum in row " + (i+1) +" is " + minrow + " , "+ maxrow );
			System.out.println("Minimum and Maximum in column " + (i+1) +" is " + mincolumn + " , "+ maxcolumn );
			
			System.out.println();
		}
		
	}

}
