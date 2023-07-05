
public abstract class Emp {
	private String name;
	private int eid;
	protected int salary;
	
	public Emp()
	{
		
	}
	public Emp(String name , int eid , int salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	public  abstract int calSalary();
	{
		
	}
	//public int getSalary()
	//{
	//	return salary ;
	//}
	public String toString()
	{
		return "Ename " +name + ", " + "E-ID " + eid+ ", " + "Salary " + salary ;
		
	} 



}
