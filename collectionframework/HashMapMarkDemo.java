
/*Julie has created a HashMap containing name and marks as key value pairs of 6 
students. Write a program, with separate user defined functions to perform the 
following operations: 
a. Push the keys (name of the student) of the hash map into a stack, where 
the corresponding value(marks) is greater than 75. 
b. Pop and display the content of the stac
 * */
package collectionframework;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class MarksCompare{
	public static void separateMark(HashMap<String,Integer> h) {
		
		Stack<String> s =new Stack<>();
		for(Map.Entry<String,Integer> itr : h.entrySet()) {
		     if(itr.getValue()>75) {
		    	 s.push(itr.getKey());
		    	 
		     }
		}
		System.out.println(s);
	}
}
public class HashMapMarkDemo {
	
	
	public static void main(String[] args) {
		HashMap<String,Integer> h =new HashMap<String, Integer>();
	    h.put("akash",45);
	    h.put("tushar",98);
	    h.put("shreenath",95);
	    h.put("tanaveer", 64);
	    h.put("ajit",98);
	    h.put("aditya",98);
	    h.put("vishash",69);
	    h.put("vidyesh",67);
	    h.put("gaurav",100);
	    MarksCompare m = new MarksCompare();
	    m.separateMark(h);
	}
	
}
