package utility;

public class Person {
	private String name;
	private int age;
	
	public Person()
	{
		
	}
	public Person(String nm, int age)
	{
		this.name=nm;
		this.age=age;
	}
	public void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}
