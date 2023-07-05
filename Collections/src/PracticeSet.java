import java.util.*;

public class PracticeSet {
	public static void main(String[] args) {
		
		LinkedHashSet<String> l1 = new LinkedHashSet<>();
		l1.add("Kartik");
		l1.add("kunal");
		l1.add("rtik");
		l1.add("kal");
		l1.add("Kark");
		l1.add("kuna");
		
		System.out.println(l1);
		
		LinkedHashSet<String> l2 = new LinkedHashSet<>();
		l2.add("Kaik");
		l2.add("nal");
		l2.add("tik");
		System.out.println(l2);
		l1.addAll(l2);
		System.out.println(l1);
	}

}
