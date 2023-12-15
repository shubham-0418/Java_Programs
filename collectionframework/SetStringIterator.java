package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

class SetDemo{
	public static void stringiterate(HashSet<String> s) {
		
		String combstr="";
		
		Iterator<String> itr = s.iterator();
		
		while(itr.hasNext()) {
			combstr=combstr+itr.next();
		}
		System.out.println("combined string is "+combstr);
	}
}
public class SetStringIterator {
	public static void main(String[] args ) {
		HashSet<String> s =new HashSet<String>();
		s.add("kkk");
		s.add("lll");
		s.add("ggft");
		SetDemo p =new SetDemo();
		p.stringiterate(s);
	}
	
}
