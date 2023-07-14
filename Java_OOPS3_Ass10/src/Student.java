
public class Student {
	private int rollNo , no_of_Sub ;
	private String name;
	private int marks[];
	int i;
   public Student()
   {
	   
   }
  public Student(int rollNo , String Name , int n , int marks[])
  {
	  this.rollNo=rollNo;
	  this.name=Name;
	  this.no_of_Sub=n;
	  this.marks=marks;
	  
  }
  public void display()
  {
	  int totalMarks = 0;
      
		for (int i = 0; i < marks.length; i++) 
		{
			double percentage = ((double) totalMarks / (no_of_Sub * 100)) * 100;
			
	        String className = getClass(percentage);

	        System.out.println("Roll Number: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Number of Subjects: " + no_of_Sub);
	        System.out.println("Marks : ");
	        
			
			for ( i = 0; i < marks.length ; i++) 
			{
	            System.out.println("Subject  : " + marks[i]);
	        }
		
			
	        System.out.println("Percentage: " + percentage);
	        System.out.println("Class Obtained: " + className );
		}
  }

	    private String getClass(double percentage) 
		{
	        if (percentage >= 90) 
			{
	            return "First Class with Distinction";
	        } 
			else if (percentage >= 75) 
			{
	            return "First Class";
	        }
			else if (percentage >= 60) 
			{
	            return "Second Class";
	        }
			else if (percentage >= 50) 
			{
	            return "Pass Class";
	        } 
			else 
			{
	            return "Fail";
	        }
	    }
	

  }

