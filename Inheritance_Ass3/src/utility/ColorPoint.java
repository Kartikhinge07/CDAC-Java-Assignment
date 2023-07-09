package utility;

public class ColorPoint extends Point {
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
	public ColorPoint(int x , int y ,String color )
	{
		super(x,y);
		int i;
		//boolean flag = false ;
		
		for( i=0 ; i< colors.length ; i++)
		{
			if(color.equals(colors [i]))
			{
			    color = colors[i]  ; 
			    this.color=color;
			  //  flag= true;
						break;
				
			}
		}
			if(i == colors.length)
			//if(flag == false)
				// this.color="white"
				
			{
				color = "White";
			}
		
		// this.color=color;
	
	}
	public void display()
	{
		super.display();
		System.out.println("Color is : " + color);
	}
	

}
