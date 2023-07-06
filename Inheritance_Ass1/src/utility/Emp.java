package utility;

public class Emp extends Person {
	private int eid;
	private float salary;
	
	public Emp()
	{
		
	}
	public Emp(int id ,String name,int age , float salary)
	{
		super(name,age);
		this.eid=id;
		
		this.salary=salary;
	
	}
	public void display()
	{
		System.out.println("Employee Info ");
		super.display();
		
		System.out.println("Employee Id : " + eid );
		System.out.println("Salary : " + salary);
		
	}

}
