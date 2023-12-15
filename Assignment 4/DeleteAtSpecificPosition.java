package Assignment_4;
/*
*	 Delete an element at the specifies position
*	 @author Shubham Patil(Expleo)
*	 @since JDK17 27/7/2023
*/



import java.util.Scanner;

public class DeleteAtSpecificPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[20];
		int n,pos;
		n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		pos = sc.nextInt();
		
		DeleteElement(arr,pos,n);
	}
	
	static void DeleteElement(int[] arr,int pos,int n) {
		
		for(int i=pos-1;i<n-1;i++){
			arr[i] = arr[i+1];
		}
		
		
		
		for(int i=0;i<n-1;i++){
			System.out.print(arr[i]+" ");
		}
	
		}
	}


