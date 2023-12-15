package com.oop;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author a1 = new Author("Tan Ah Teck", "ahteck@nowhere.com");
		Book b1 = new Book("12345", "Java for dummies", a1, 8.8, 88);
		
	      System.out.println(b1);
	      System.out.println("isbn is: " + b1.getIsbn());
	      System.out.println("name is: " + b1.getName());
	      System.out.println("price is: " + b1.getPrice());
	      System.out.println("qty is: " + b1.getQty());
	      System.out.println("Author name is:"+(b1.getAuthor()).getName());
	      System.out.println("Author Email is:"+(b1.getAuthor()).getEmail());
	      System.out.println("author is: " + b1.getAuthor());
	      
	      b1.setPrice(90.0);
	      b1.setQty(50);
	      
	      (b1.getAuthor()).setEmail("Balguru@123");
	      (b1.getAuthor()).setName("Balguruswami");
	      
	      System.out.println(b1);
	      
	}

}
