import java.util.*;


public class Demo {
	public static void main(String[] args) {
		
		 TreeSet<Emp> t1 = new TreeSet<>();
		 
		 t1.add(new Emp(101,"Kartik",1000));
		 t1.add(new Emp(104,"Ritik",2000));
		 t1.add(new Emp(103,"Artik",3000));
		 t1.add(new Emp(456,"Manohar",325000));
		 t1.add(new Emp(555,"Soham",745000));
		 t1.add(new Emp(4564,"Shivam",500000));
		 t1.add(new Emp(4556,"Mandar",254000));
		
		 System.out.println(t1);
		 
	}

}
