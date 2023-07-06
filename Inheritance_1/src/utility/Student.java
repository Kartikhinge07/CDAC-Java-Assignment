package utility;


public class Student extends Person {
	private int rno;
	private float per;
	
	public Student()
	{
		
	}

	public Student(int rno, String nm , int a ,   float per) {
		super(nm,a);
		this.rno = rno;
		this.per = per;
	}
	public void display()
	{
		super.display();
		
		System.out.println("Roll no : " +rno);
		System.out.println("Percentage : " + per);
	}
	
	
	

}
