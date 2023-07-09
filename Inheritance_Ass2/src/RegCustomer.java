
public class RegCustomer extends Customer {
	private int reg_no ;
	
	public RegCustomer()
	{
		
	}
	public RegCustomer (String emailId , String name ,int reg_no  )
	{
		super(emailId,name);
		this.reg_no=reg_no;
		
	}
	public String toString()
	{
		return "Reg no" + reg_no +super.toString();
	}
	public void getDiscount()
	{
		
	}
	

}
