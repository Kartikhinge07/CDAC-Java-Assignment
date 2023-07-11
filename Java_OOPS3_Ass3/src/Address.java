
public class Address {
	private String area, city;
	private int pincode;
	public Address()
	{
		
	}
	public Address(String a , String  c, int p)
	{
		this.area=a;
		this.city=c;
		this.pincode=p;
		
	}
	public void display()
	{
		System.out.println("Address is " +area+ "," +city+ "," +pincode);
	}
 
}
