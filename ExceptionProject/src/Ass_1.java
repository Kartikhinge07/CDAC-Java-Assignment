
public class Ass_1 {
	public static void main(String [] args)
	{
		try {
			int no1 = Integer.parseInt(args[0]);
			int no2 = Integer.parseInt(args[1]);
			
			float res = no1/no2;
			System.out.println("Result  " + res);
		    
		}
		catch(ArithmeticException obj)
		{
			obj.printStackTrace();
			//System.out.println(obj.getMessage());
		} 
		catch(Exception obj)
		{
			obj.printStackTrace();
		}
		
	}

}
