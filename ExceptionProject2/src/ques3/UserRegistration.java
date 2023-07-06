package ques3;

public class UserRegistration {
	String userName , userCountry ;
	public UserRegistration()
	{
		
	}

	public UserRegistration(String userName, String userCountry) {
		super();
		this.userName = userName;
		this.userCountry = userCountry;
	}
	
	public boolean registerUser() throws InvalidCountryException
	{
		boolean flag = false ;
		if(userCountry == "India")
		{
			flag = true;
			System.out.println("welocome");
		}
		if(flag == false)
		throw new InvalidCountryException();
		return flag;
		
	}
	 public static void main (String [] a)
	 {
		 try {
		 UserRegistration r1 = new UserRegistration("Kartik" , "India");
		 r1.registerUser();
		 System.out.println("Valid User ");
		 }

		 catch(InvalidCountryException obj)
		 {
			 System.out.println(obj.getMessage());
		 }
	 }
	

}
