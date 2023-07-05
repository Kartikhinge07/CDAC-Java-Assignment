import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class StudentDemo   {
	public static void main(String [] args)
	{
		HashSet<Student>  s1 = new HashSet();
		s1.add(new Student (1,"Aayan",100));
		s1.add(new Student (1,"kalia",103));
		s1.add(new Student (3,"raju",102));
		s1.add(new Student (4,"shiva",101));
		
		System.out.println(s1 );
	//	System.out.println(s1.hashCode());  
		
	/*	TreeSet<String>  s1 = new TreeSet<>();
		s1.add("kartik");
		s1.add("kalia");
		s1.add("raju");
		s1.add("shiva");
		
		System.out.println(s1 ); */
	}

}
