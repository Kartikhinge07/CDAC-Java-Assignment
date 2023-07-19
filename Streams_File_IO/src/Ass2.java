import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class Ass2 {
	public static void main(String []  args ) throws IOException
	{
		int rollNo; 
		String name;
		int marks;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		rollNo = (int )br.read();
		name= (String )br.readLine();
		marks=(int) br.read();	}

}
