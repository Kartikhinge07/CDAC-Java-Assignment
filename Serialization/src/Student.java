import java.io.Serializable;

public class Student implements Serializable{
	
	int rollno;
	String name;
	float percentage;
	
	public Student(int rollno, String name, float percentage) {
		
		this.rollno = rollno;
		this.name = name;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
	
	

}
