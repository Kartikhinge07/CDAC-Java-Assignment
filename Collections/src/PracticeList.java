import java.util.ArrayList;
import java.util.LinkedList;

public class PracticeList {
	public static void main(String [] args) {
		
	/*	ArrayList<String> a1 = new Arraylist<>();
		a1.add("kartik");
		a1.add("hinge");
		System.out.println(a1);
		
		
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(856);
		a1.add(654);
		a1.add(458);
		System.out.println(a1); */
		
		LinkedList<String> l1 = new LinkedList<>();
		l1.add("kartik");
		l1.add("bada");
		l1.add(0,"abhi");
		System.out.println(l1);
		LinkedList<String> l2 = new LinkedList<>();
		l2.add("manohar");
		l2.add("shivam");
		l2.add(1, "mandar");
		l1.addAll(l2);
		System.out.println(l1);
		 System.out.println( l1.size());
		 System.out.println(l1.contains("mandar"));
		
		l1.remove("shivam");
		System.out.println(l1);
		
		l1.removeAll(l2);
		System.out.println(l1);
		
	}

}
