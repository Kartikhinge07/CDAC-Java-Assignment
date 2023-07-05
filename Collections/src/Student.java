import java.util.ArrayList;

public class Student {


	int rollNo;
	String Name;
	int marks ;

	public Student(int rollNo, String name ,  int marks) {
		
		this.rollNo = rollNo;
		this.Name = name;
		this.marks = marks;
	}

	@Override
	public int hashCode() {

		return rollNo ;
	}

	@Override
	public String toString() {
		return "\n Student [rollNo=" + rollNo + ", Name=" + Name + ", marks=" + marks + "]";
	}



}
