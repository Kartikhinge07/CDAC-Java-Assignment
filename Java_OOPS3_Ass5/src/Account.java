
public class Account {
	static int int_rate;
	private String  accname ; 
	private int balance ;
	private int accno;
	public static void setInterestRate(int r)
	{
		int_rate=r;
	}
	public Account()
	{
		
	}
	public Account(String accname, int balance, int accno)
	{
		this.accname=accname;
		this.balance=balance;
		this.accno=accno;
	}
	public void totalBalance(int bal)
	
	{
		bal=balance*int_rate;
		System.out.println("total amount : " + bal);
	}
	public void display()
	{
		System.out.println("Account Details : " +accname+ " // " + " Acc no :  " +accno);
		System.out.println("Interest rate : " + int_rate);
		System.out.println("your Balance is : " + balance);
	}

}
