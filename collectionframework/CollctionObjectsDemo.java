package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Mobile implements Comparable<Mobile>{
	private String name ;
	private String mobilemodel;
	private double price;
	private float mobilelength;
	private int mobilememory;
	
	public Mobile(String name,String mobilemodel,double price,float mobilelength,int mobilememory) {
	
		this.name=name;
		this.mobilelength=mobilelength;
		this.mobilememory=mobilememory;
		this.price=price;
		this.mobilemodel=mobilemodel;
	}
//	 public String toString() {
//		 return "name :"+name+" mobilemodel : "+mobilemodel+" price : "+price+" mobilelength :  "+mobilelength+" mobilememory : "+mobilememory;
//	 }

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", mobilemodel=" + mobilemodel + ", price=" + price + ", mobilelength="
				+ mobilelength + ", mobilememory=" + mobilememory + "]";
	}
@Override
public int compareTo(Mobile o) {
	// TODO Auto-generated method stub
	;
}


	
	
	
}

}
public class CollctionObjectsDemo {
	
	
	public static void main(String[] arg) {
		Scanner sc =new Scanner(System.in);
	 String name ;
	 String mobilemodel;
	 double price;
	 float mobilelength;
	 int mobilememory;
	 
	 ArrayList a = new ArrayList();
	 for(int i=0;i<2;i++) {
		 System.out.println();
     System.out.println(i+" Enter name : ");
     name=sc.nextLine();
     System.out.println(i+" Enter mobilemodel : ");
	 mobilemodel=sc.nextLine();
	 System.out.println(i+" Enter price  : ");
	 price=sc.nextDouble();
	 System.out.println(i+" Enter length : ");
	 mobilelength=sc.nextFloat();
	 System.out.println(i+" Enter memory : ");
	 mobilememory=sc.nextInt();
     Mobile m = new Mobile(name, mobilemodel, price, mobilelength, mobilememory);
     a.add(m);
	   }
	 //System.out.println(a);
	 for(Object o:a) {
		 System.out.println(o.toString());
	 }
	 
	 
	
	 }
   }

