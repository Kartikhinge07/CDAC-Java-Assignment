
public class PaperBook extends Book {
	 float delivery_charges ;
	
	public PaperBook()
	{
	
	}

	public PaperBook(int bId, String name, float Price) 
	{
		super(bId, name, Price);
		
	}
	public void calculateCost()
	{
		if(super.getPrice() <=500)
		{
			delivery_charges = Price - (Price/100)*7 ;
			
		}
		if(super.getPrice() > 500 && super.getPrice()<=1000)
		{
			delivery_charges = Price -(Price/100)*5 ;
			
		}
		if(super.getPrice() > 1000 && super.getPrice()<=5000)
		{
			delivery_charges = Price -(Price/100)*2;
			
		}
		
		
	}
	public void display()
	{
		System.out.println("-----------------------");
		System.out.println("Book info : " +super.toString());
		System.out.println("Delivery  Charges : " + delivery_charges);
	}
	

	
	
	

	
	
	

}
