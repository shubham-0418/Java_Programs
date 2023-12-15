package com.exceptionHandling;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class NoMatchException extends Exception
{
    public NoMatchException(String s)
    {
        super(s);
    }
}
class Citizen
{
    private String adharNumber;
    private String name,city,state,country;
    public Citizen(String aadharNumber, String name, String city, String state, String country) {
        super();
        this.adharNumber = aadharNumber;
        this.name = name;
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getAdharNumber() {
        return adharNumber;
    }
    @Override

    public String toString() {
        return "Citizen [adharNumber=" + adharNumber + ", name=" + name + ", city=" + city + ", state=" + state
                + ", country=" + country + "]";
    }
}
public class CitizenDetails {

	public static void main(String[] args) throws NoMatchException 
	{
		// TODO Auto-generated method stub
		
		String aadharNumber;
		String name;
		String city;
		String state;
		String country;
		
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		
		System.out.print("Aadhar Number:");
		aadharNumber = sc.nextLine();
		Pattern p=Pattern.compile("[0-9]");
		   Matcher m = p.matcher(aadharNumber);

	         try {

	         if(!(aadharNumber.matches(".*[0-9].*") && aadharNumber.length() >= 8))
	         {
	             throw new Exception("Adhar Number Should only number");
	         }
//	         else
//	         {
//	             Citizen c1=new Citizen(adharNumber,name,city,state,country);
//	             System.out.println(c1);
//	         }
	         }
	         catch(Exception e)
	         {
	             System.out.println(e.getMessage());
	         }
		System.out.println("Name :");
		name = sc.nextLine();
		
		System.out.println("City  :");
		city = sc.nextLine();
		
		System.out.println("State  :");
		state = sc.nextLine();
		
		System.out.println("Country  :");
		country = sc.nextLine();
		try {
			if(!("india".equalsIgnoreCase(country)))
				throw new NoMatchException("Country name should be India!");
			else {
				Citizen c = new Citizen(aadharNumber, name, city, state, country);}
//				Citizen citizen = new Citizen(aadharNumber, name, city, state, country);
//				System.out.println(c);
		} catch (NoMatchException e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}

 