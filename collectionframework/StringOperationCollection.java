
/* Write a program that reads a string and display the strings as any collection object 
of any type with idea of menu driven option for each operation and use functions 
for the same. 
a. Display all words. 
b. Display them with all plurals (ending in "s") capitalized. 
ss
d. Display them with all plural words removed.*/
package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

class StringOperation{
	
	public static void printarr(String arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print("[ "+arr[i]+" ");
		}
		System.out.println(" ]");
		
	}
	
	public static boolean pluralWord(String name ) {
		int n=name.length();
		System.out.println();
		
		if(name.charAt(n-1)=='s') {
			System.out.println(name);
			return true;
		}
		return false;
	}
	
	public static void reverse(String arr[] ) {
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void removedPlural(String arr[]) {
		
		ArrayList<String> a= new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(pluralWord(arr[i])) {
				a.add(arr[i]);
			}
		}
		System.out.println(a);
	}
	public static void stringoperation( String name ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Display all words.");
		System.out.println("2. Display them with all plurals (ending in \"s\") capitalized.");
		System.out.println("3. Display them in reverse order. ");
		System.out.println("4. Display them with all plural words removed.");
		System.out.println("eneter your choise ");
		
		String arr[]=name.split("_");
		
		int n=sc.nextInt();
		switch(n) {
		
		case 1:{
			printarr(arr);
			break;
		}
		case 2:{
			for(int i=0;i<arr.length;i++) {
				pluralWord(arr[i]);
			}
		}
		case 3:{
			reverse(arr);
			break;
		}
		case 4:{
			removedPlural(arr);
			break;
		}
		
		}
		
		
	}
}

public class StringOperationCollection {

		public static void main(String[] args ) {
			
			Scanner sc = new Scanner(System.in);
			StringOperation s =new StringOperation();
			String name =sc.nextLine();
			s.stringoperation(name);
			
			
		}
}
