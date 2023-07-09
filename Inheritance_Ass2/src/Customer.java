
public class Customer {
	private String emailId;
	private String name;
	
	public Customer()
	{
		
	}
	public Customer (String emailId , String name)
	{
		this.emailId=emailId;
		this.name=name;
		
	}
	 /*public void display()
	 {
		 System.out.println("Customer Information : " );
		 System.out.println("Customer EmailId : " +emailId );
		 System.out.println("Customer name : " + name); */
	// }
	public String toString()
	{
		return "Name" + name + "Email" + emailId ;
	}
	

}
