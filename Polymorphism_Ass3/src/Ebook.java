
public class Ebook extends Book {
	
	float final_cost;
	
	public Ebook() {
		
		
	}

	public Ebook(int bId, String name, float Price )
	{
		super(bId, name, Price);
		
	}
	
	public void calculateCost()
	{

		if(super.getPrice() <=500)
		{
			final_cost= Price - (Price/100)*2 ;
			
		}
		if(super.getPrice() > 500 && super.getPrice()<=1000)
		{
			final_cost= Price -(Price/100)*5;
			
		}
		if(super.getPrice() > 1000 && super.getPrice()<=5000)
		{
			final_cost = Price -(7/100)*7 ;
			
		}
		
		
		
	}
	public void display()
	{
		System.out.println("Book Info : " + super.toString()  );
		System.out.println("Final Price : " + final_cost);
	}
	
	   
	
   
}
