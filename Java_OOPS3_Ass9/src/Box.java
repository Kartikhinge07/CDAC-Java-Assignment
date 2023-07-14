
	class BoxInfo 
	{
	    double length;
	    double width;
	    double height;

		public BoxInfo() 
		{
	      
	    }



	    public BoxInfo(double length, double width, double height) 
		{
	        this.length = length;
	        this.width = width;
	        this.height = height;
	    }

	    public double getVolume() 
		{
	        return length * width * height;
	    }
		
	}

	public class Box 
	{
	    public static void main(String[] args) 
		{
	       
	        BoxInfo[] boxes = new BoxInfo[3];

	       
	        boxes[0] = new BoxInfo(2, 3, 4);
	        boxes[1] = new BoxInfo(5, 6, 7);
	        boxes[2] = new BoxInfo(8, 9, 10);

	   
	        for (int i = 0; i < boxes.length; i++) 
			{
	            double volume = boxes[i].getVolume();
	            System.out.println("Box  volume : " + volume);
	        }
	    }
	}




