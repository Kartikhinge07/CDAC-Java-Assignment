package Ass3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Emp> e1 =  new ArrayList<>();
		e1.add(new Emp(156,"Kartik",100056));
		 e1.add(new Emp(145,"Ritik",200450));
		 e1.add(new Emp(456,"Manohar",325000));
		 e1.add(new Emp(555,"Soham",745000));
		 e1.add(new Emp(456,"Shivam",500000));
		 e1.add(new Emp(457,"Mandar",259000));
		 
		 System.out.println("before sorting" + e1); 
		 
		 System.out.println("after sorting");
		 Collections.sort(e1,new SortEmpId());
		 System.out.println(e1);
		 
		 System.out.println( );
		 
		// System.out.println("after reversing");
		// Collections.reverse(e1);
		// System.out.println(e1);
	}

}
