
public class Programmer extends Emp {
	private int extra_hrs;
	private int charges_per_hrs;
	
	public Programmer()
	{
		
	}
	public Programmer(String name , int age ,int d ,int m, int y, int eid , int salary,  int ex , int cph)
	{
		super(name,age,d,m,y,eid,salary);
		this.extra_hrs=ex;
		this.charges_per_hrs=cph;
		
	}
	public int calSalary()
	{
		return super.getSalary() + extra_hrs*charges_per_hrs ;
	}
	
}
