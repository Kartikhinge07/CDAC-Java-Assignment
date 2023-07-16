
public class SalesManager extends Emp {
	private int target;
	private int incentive;
	
	public SalesManager()
	{
		
	}
	public SalesManager(String name , int age ,int d ,int m, int y, int eid , int salary, int target, int incentive)
	{
		super(name,age,d,m,y,eid,salary);
		this.incentive=incentive;
		this.target=target;
	}
	public int calSalary()
	{
		return super.getSalary() + target*incentive  ;
	}
	

}
