import java.util.ArrayList;
import java.util.Collections;

public class linkedList {

	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(10);
		a1.add(6);
		a1.add(40);
		a1.add(90);
		a1.add(00);
		a1.add(80);
		a1.add(70);
		
		System.out.println(a1);
		a1.add(5,100);
		System.out.println(a1);
		a1.add(120);
		
		
		if(a1.contains(a1))
		{
		System.out.println("available");
		
		}
		else {
			System.out.println("not available");
		}
		
		
		
		Collections.sort(a1);
		System.out.println(a1);
		
		a1.remove(6);
		System.out.println(a1);
		
		System.out.println(a1.size());
		
	

	}

}
