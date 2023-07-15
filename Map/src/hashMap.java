import java.util.HashMap;
import java.util.Map;

public class hashMap {
	public static void main(String[] args) {
		
		HashMap<Integer,String> h1 = new HashMap<>();
		h1.put(12,"Pune");
		h1.put(35,"Gondia");
		h1.put(36,"Bhandara");
		h1.put(40,"Nagpur");
		h1.put(33,"Gadchiroli");
		
		System.out.println(h1);
		
		System.out.println("value " + h1.containsValue("Bhandara"));
		
		for(Map.Entry m : h1.entrySet())
		{
			System.out.println("Key " +m.getKey() + "value " +m.getValue());
		}
		System.out.println("value "  + h1.get(36));
		
	}

}
