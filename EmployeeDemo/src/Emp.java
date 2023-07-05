
public class Emp {
	private int eid;
	private String name;
	private float salary;
	private String deptName;
	static String departments[];
	
	static 
	{
		departments = new String[5];
		departments[0] = "Admin";
		departments[1] = "finance";
		departments[2] = "Project";
		departments[3] = "Hr";
		departments[4] = "Sales";
		
	}
	public Emp (int id , String name , float sal , String deptName )
	{
		this.eid=id;
		this.name=name;
		this.salary=sal;
		int i;
		// this.departments=dept;
		for( i=0 ; i< departments.length ; i++)
		{
			if(deptName.equals(departments [i]))
			{
			    deptName = departments[i]  ; //this.deptName
						break;
				
			}
		}
			if(i == departments.length)
			//else
			{
				deptName = "Training"; //this.deptName
			}
		
		this.deptName=deptName;
	
	}
		public void display ()
		{
			
			System.out.println("Employee Information : " + eid);
			System.out.println("Employee Name : " + name);
			System.out.println("Employee Salary : " + salary);
			System.out.println("Employee Department : " + deptName );
			System.out.println(" ------------------- ");
			
		}
	}



