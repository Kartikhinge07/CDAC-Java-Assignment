import java.io.*;
public class Ass1 {
	public static void main( String [] args) throws Exception 
	{
		InputStreamReader f1= new InputStreamReader(System.in);
	
		BufferedReader bfin=new BufferedReader(f1);
		int i=0;
		int count =0;
		System.out.println(" Enter Data ");
		do
		{ }
		
		while((i=bfin.read()) !='q');
			System.out.println((char)i);
		bfin.close();

	}

}
