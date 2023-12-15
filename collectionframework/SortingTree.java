package collectionframework;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

class SortInpute{
	public static void sorting() {
		Scanner sc = new Scanner(System.in);
		System.out.println("no of inpute you want to entere");
		int n =sc.nextInt();
		
		TreeSet<Integer> t =new TreeSet<>();
		
		int max =0;
	    int min=0;
		for(int i=0;i<n;i++) {
			
			System.out.println("entere values");
			int num=sc.nextInt();
			min=num;
			max=num;
			t.add(num);
			
		}
		
		Iterator<Integer> itr = t.iterator();
		while(itr.hasNext()) {
			int no=itr.next();
			if(no>max) {max=no;}
			if(no<min) {min=no;}
		}
		
		System.out.println("MInimum number : "+min);
		System.out.println("maximun number : "+max);
	}
}
public class SortingTree {
	public static void main(String[] args ) {
		SortInpute s = new SortInpute();
		s.sorting();
	}
}
