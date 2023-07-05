
public class Programmer extends Emp{
	private int extra_hrs;
	private int charges_per_hrs;
	
	public Programmer()
	{
		
	}
	public Programmer(String name , int eid , int salary,  int ex , int cph)
	{
		super(name, eid, salary);
		this.extra_hrs=ex;
		this.charges_per_hrs=cph;
		
	}
	
	
	public int calSalary()
	{
		return salary + extra_hrs*charges_per_hrs ;
	}
	@Override
	public String toString() {
		return "Programmer [ Emp Info : " + super.toString() + ",extra_hrs=" + extra_hrs + ", charges_per_hrs=" + charges_per_hrs + ", calSalary()="
				+ calSalary() + ", Actual Salary = " + salary + "]";
	}
	
	
	
}




