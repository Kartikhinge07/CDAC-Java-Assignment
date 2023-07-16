
public class BookDemo {
	public static void main(String [] args)
	{
		
	    Ebook b1 = new Ebook(101, "java" , 400 );
	
		b1.calculateCost();
		b1.display();
		
		PaperBook p1 = new PaperBook(101, "java" , 400);
		p1.calculateCost();
		p1.display();
		

	}

}
