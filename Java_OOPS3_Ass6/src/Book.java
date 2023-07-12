 
public class Book {
	static int cnt;
	private String title;
	private float price;
	private int id;
	public static void setCounter(int c)
	{
		cnt=c;
	}
	public Book ()
	{
		
	}
	public Book (String title , float price)
	{
		cnt++;
		id=cnt;
		this.title = title;
		this.price = price;
	}
	public void display()
	{
		System.out.println("Book Information : ");
		System.out.println("Book id :" + id);
		System.out.println("Title : " + title);
		System.out.println("price : " + price);
		System.out.println("-------------------");
		
	}
	
	

}
