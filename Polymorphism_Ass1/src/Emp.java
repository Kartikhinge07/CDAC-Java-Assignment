
public class Emp extends Person{
	private int eid;
	private int salary;
	
	public Emp()
	{
		
	}
	public Emp(String name , int age ,int d ,int m, int y, int eid , int salary)
	{
		super(name , age ,d,m,y);
		this.eid=eid;
		this.salary=salary;
	}
	public int getSalary()
	{
		return salary ;
	}
	public String toString()
	{
		return "E-ID " + eid+ "/" + super.toString() + "Salary " + salary ;
		
	} 

}
