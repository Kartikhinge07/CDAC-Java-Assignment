
public class Admin extends Emp{
	private int bonus;
	
	public Admin()
	{
		
	}
	public Admin (String name , int age ,int d ,int m, int y, int eid , int salary , int bonus)
	{
		super(name,age,d,m,y,eid,salary);
		this.bonus=bonus;
	}
	public int calSalary()
	{
		return super.getSalary()+bonus;
	}

}
