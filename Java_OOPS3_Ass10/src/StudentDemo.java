
public class StudentDemo {
	public static void main(String[] args)
	{
		 int[] marks1 = {75, 80, 85, 90};
	        Student student1 = new Student(101, "Seeta", 4, marks1);
			student1.display();
	        System.out.println();

	        int[] marks2 = {60, 70, 80};
	        Student student2 = new Student(102, "Geeta", 3, marks2);
			student2.display();
	        System.out.println();

	        int[] marks3 = {50, 60, 70, 80, 90};
	        Student student3 = new Student(103, "Neeta", 5, marks3);
			student3.display();
			
	}

}
