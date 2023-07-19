import java.io.*;

public class DeserializationDemo {
	public static void main(String[] args) throws Exception{
		Student s1;
		ObjectInputStream ooi=new ObjectInputStream(new FileInputStream ("newemp.dat"));
		for(int i=0;i<5;i++)
		{
			s1=(Student)ooi.readObject();
			System.out.println(s1);
		}
		ooi.close();
		
		/*File fname="abc.txt";
		System.out.println(" File "+fname.isFile());
		System.out.println(" File "+fname.isDirectory()); */ 
	}

}
