package collectionframework;

import java.util.HashMap;

class Frequency{
	public void findfrequency(String name ) {
		HashMap<Character,Integer> h =new HashMap<>();
		
		for(int i=0;i<name.length();i++) {
			if(h.containsKey(name.charAt(i))) {
				h.put(name.charAt(i), h.get(name.charAt(i))+1);
			}
			else {
				h.put(name.charAt(i), 1);
			}
		}
		System.out.println(h);
	}
}
public class HashMapDemo {

	public static void main(String[] args ) {
		String name ="javainputoutput";
		Frequency f = new Frequency();
		f.findfrequency(name);
	}
}
