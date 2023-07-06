package ques4;

public class ColorPoint  {
	
	private String color;
	private static String colors[];
	
	static
	{
		colors = new String[5];
		colors[0]="Black";
		colors[1]="Brown";
		colors[2]="Pink";
		colors[3]="Red";
		colors[4]="Yellow";
		
	}
	public ColorPoint(String color )
	{
		this.color=color;
	}
	
	public boolean checkColor () throws ColorException
	{
		int i;
		
		for( i=0 ; i< colors.length ; i++)
		{
			if(color.equals(colors [i]))
			{
			    color = colors[i]  ; 
			    
			  System.out.println("Valid Color");
					break;
				
			}
		}
			if(i == colors.length)
			{
				throw new ColorException() ;
			}
			return false;
	}
	
public static void main(String [] a)
{
	try {
	ColorPoint c1 = new ColorPoint("violet");
	c1.checkColor();
	System.out.println("valid Color");
	}
	catch(ColorException obj)
	{
		System.out.println(obj.getMessage());
	}
	
}
	
	

}
