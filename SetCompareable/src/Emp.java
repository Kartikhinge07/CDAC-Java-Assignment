
public class Emp implements Comparable<Emp>  {

	private int eId ;
	private String Name ;
	private int Salary;

	public Emp(int eId, String Name, int salary) {

		this.eId = eId;
		this.Name = Name;
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return  "\n"+ "Emp [eId=" + eId + ", Name=" + Name + ", Salary=" + Salary + "]";
	}
	/*public int compareTo(Emp o)
	{
		return( this.Name.compareTo(o.Name)); 
	} */
	
	public int compareTo(Emp obj)
	{
		return this.eId-obj.eId;
	}






}


