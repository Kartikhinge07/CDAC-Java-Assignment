
public class Person {
	private String name;
	private int age;
	private Date dob;
	
	public Person()
	{
		
	}
	public Person(String name , int age , int d ,int m, int y)
	
	{
		this.name=name;
		this.age=age;
		dob=new Date(d,m,y);
	}
	public String show()
	{
		String str = dob.Show();
		return "\t" + name + str ;
	}
	public void display()
	{
		System.out.println("Name : " + name);
		dob.display();
	}
	public String toString()
	{
		return "Name" + name + "Age" + age + "DOB" + super.toString();	
	}
	

}
