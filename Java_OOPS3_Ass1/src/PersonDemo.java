
public class PersonDemo {
	public static void main(String [] a)
	{
		Person p1 = new Person ("Kartik " ,3,4,23);
		p1.display();
		Person p2 = new Person ("Kartik",new Date(4,5,2000));
         System.out.println(p2.Show());	
	}

}
