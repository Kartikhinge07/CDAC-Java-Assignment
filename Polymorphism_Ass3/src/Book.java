
public class Book {
    private int bId ;
    private String name;
     float Price ;
    
    public Book()
    {
    	
    }

	public Book(int bId, String name, float Price) {
		
		this.bId = bId;
		this.name = name;
		this.Price = Price;
	}

	public float getPrice() {
		return Price;
	}
	
	public String toString()
	{
		return "Book Id " + bId + "\t" + " Name " + name+ "\t" + "Price " +Price ;
	}
	
	
    
    
		

	

}
