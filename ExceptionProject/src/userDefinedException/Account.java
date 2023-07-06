package userDefinedException;

public class Account {
	String uname , password ;
	
	public Account()
	{
		
	}
	public Account(String name , String pass)
	{
		this.uname = name;
		this.password=pass;
	}
	
	public  boolean validateUserName()
	{
		boolean flag = false;
		if(uname.charAt(0)>=65 && uname.charAt(0)<= 90)
		{
			if(uname.length() >= 5 && uname.length()<=10)
				flag=true;
			System.out.println("Welcome user");
		}
		if(flag==false)
		throw new InvalidUserNameException();
		return flag ; 
		
	}
	public boolean validatePassword()
	{
		int i=0;
		boolean flag = false ;
		char p[] = new char [password.length()];
		
		for(i=0 ; i<password.length();i++)
		{
			p[i]= password.charAt(i);
		}
		
		for(i=0 ; i<password.length();i++)
		{
		if( p[i] >=48  && password.charAt(i)<= 57)
		{
			if(password.length()>=5 && password.length()<=8)
			{
				flag=true;
				System.out.println("Welcome to System");
			}
		}
		}
		if(flag==false)
		{
			throw new InvalidPasswordException();
		}
		return flag;
		
			
	}
	
	

}
