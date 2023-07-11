
public class Customer {
	private String email;
	public void email(String email)
	{
		this.email=email;
	}
	public void display()
	{
		System.out.println("email is " +email);
	}
	public void displayAdd()
	{
		Address obj= new Address();
		obj.display();
	}

}
