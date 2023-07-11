public class Line 
{
	private Point start , end ;
	public Line()
	{
		
	}
	public Line(int x1,int x2, int y1 , int y2)
	{
	start = new Point(x1,y1);
	end = new Point(x2,y2);
	}
	
	public void display()
	{
		start.display();
		end.display();
	}
	
}


 