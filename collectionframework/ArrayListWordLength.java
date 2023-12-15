package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class PrintWord{
	public static void show() {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter no of string you  want");
		int n=sc.nextInt();
		ArrayList<String> a =new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			a.add(sc.next());
		}
		
		Iterator<String> itr =a.iterator();
		
		while(itr.hasNext()) {
			String str=itr.next();
			if(str.length()>=5) {
			System.out.println(str);
			}
			
		}
		
	}
}
public class ArrayListWordLength {
		public static void main(String[] args ) {
			PrintWord p = new PrintWord();
			p.show();
			
		}
		
}
