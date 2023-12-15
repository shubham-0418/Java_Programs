package collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

class Laptop implements Comparator{
	String name ;
	int memory;
	double price;
	
	public double getPrice() {
		return price;
	}
	public Laptop(String name, int memory, double price) {
		super();
		this.name = name;
		this.memory = memory;
		this.price = price;
	}


	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.memory,o2.);
	}
	

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", memory=" + memory + ", price=" + price + "]";
	}
	
}

public class lapTopDriver {
	
	public static void main(String [] args ) {
		ArrayList<Laptop> laptops = new ArrayList<>();
     laptops.add(new Laptop("Dell", 8, 800.0));
     laptops.add(new Laptop("HP", 16, 1000.0));
     laptops.add(new Laptop("Asus", 12, 900.0));
     
     Iterator itr =laptops.iterator();
     while(itr.hasNext()) {
    	 
    	 System.out.print(itr.next().toString()+" --> ");
     }
     
}
	
	 
}
