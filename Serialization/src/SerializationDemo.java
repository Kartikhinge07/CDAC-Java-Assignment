import java.io.*;
import java.util.Scanner;

public class SerializationDemo {
	public static void main(String[] args) throws Exception{
	 Student s1;
	 int rollno;
	 String name;
	 float percentage;
	
	 Scanner sc=new Scanner(System.in);
	 ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream ("newemp.dat"));
	 for(int i=0;i<5;i++)
	 {
		System.out.println(" Enter rollno name and Percentage");
		rollno=sc.nextInt();
		name=sc.next();
		percentage= sc.nextFloat();
		s1=new Student(rollno,name,percentage);
		oos.writeObject(s1);
		
	 }
	 oos.close();
	 
	/* int no ;
	 int sum=0;
	 for(int i=0;i<5;i++)
	 {
		 no=sc.nextInt();
		 sum=sum+no;
	 } */
	 
	 
	 
	 
	 
	 


		
		
		/*ObjectInputStream ois=new ObjectInputStream(new FileInputStream("emp.dat"));
		Emp e2=(Emp)ois.readObject();
		System.out.println(e2);
		ois.close();*/
		
		
		
		
		
		
	}

}
