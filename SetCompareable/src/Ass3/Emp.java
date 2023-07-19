package Ass3;


public class Emp   {

	private int eId ;
	private String Name ;
	private double Salary;

	public Emp(int eId, String Name, double salary) {

		this.eId = eId;
		this.Name = Name;
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "\n"+ "Emp [eId=" + eId + ", Name=" + Name + ", Salary=" + Salary + "]";
	}

	public int geteId() {
		return eId;
	}

	public String getName() {
		return Name;
	}

	public double getSalary() {
		return Salary;
	}

	
	}
	



