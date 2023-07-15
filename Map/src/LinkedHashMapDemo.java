import java.util.*;
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		String str= "india";
		
		 LinkedHashMap <Character,Integer> h1 = new LinkedHashMap<>();
		for( int i=0 ; i<str.length();i++)
		 {
			 h1.put(str.charAt(i), i);
		 }
//		 System.out.println(h1); 
		 
		// h1.put("karitik", 7);
		 //System.out.println(h1);

	}

}
