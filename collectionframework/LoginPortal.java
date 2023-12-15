
/*
 * Your friend is starting up a new web site that is going to have users register as 
members. He asks you to help implement an application that would validate a 
member’s login. Your task is to write a program that reads a record from the user 
containing the full name, username, and password for each user. 
Create a HashMap with the username as key and the password as value.Create 
another HashMap with the username as key and full name as value. After reading the 
record, prompt the user to enter the login name and password. 
If the password is incorrect, give the user two more chances. If the password is 
incorrect all three times, the program quits. If the login is successful, print a welcome 
message with Full Name. 
*/
package collectionframework;

import java.util.*;
class SignUp{
	
	Scanner sc =new Scanner(System.in);
	public void login(HashMap<String, String> h ,HashMap<String, String> t) {
	
		System.out.println("Please Enter Username : ");
		String username =sc.next().toLowerCase();
		System.out.println("enter password");
		String password = sc.next();
		
		if(h.containsKey(username)) {
			if(h.get(username).equals(password)) {
				System.out.println("Login Successfull");
				System.out.println("Well come "+t.get(username));
				System.out.println("your username is "+username);
				return;
			}
			else {
				System.out.println("Wrong password !");
				System.out.println("you have three chanse to login");
				
				for(int i=0;i<3;i++) {
					System.out.println("Please Enter Username : ");
					String username1 =sc.next().toLowerCase();
					System.out.println("enter password");
					String password2 = sc.next();
					if(h.get(username).equals(password2)) {
						System.out.println("Login Successfull");
						System.out.println("Well come "+t.get(username));
						System.out.println("your username is "+username);
						return;
					}
					else {
						System.out.println("Wrong ! try one more time  ");
						
					}
				}
				System.out.println("Sorry after three atemp we can not logged you in ");
			}
		}
	}
}

class   SignUp{
	
	Scanner sc = new Scanner(System.in);
	//--------------------------------------username    -pass---
	HashMap<String ,String> h = new HashMap<String, String>();
	//-------------------------------------username   -- name 
	HashMap<String ,String> t = new HashMap<String, String>();
	
	
	public void getdata() {
		int n;
		System.out.println("enter no of users ");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.println("enter full name : ");
			String fname=sc.nextLine();
			
			System.out.println("enter username ");
			String username=sc.next();
			
			String password=sc.next().toLowerCase();
			
			h.put(username, password);
			t.put(username, fname);
		}
		SignUp u = new SignUp();
		u.login(h, t);
	}
	
	
	
	
}


public class LoginPortal{
	
	public static void main(String[] args ) {
		GetCredincial d = new GetCredincial();
		d.getdata();
	}
}


