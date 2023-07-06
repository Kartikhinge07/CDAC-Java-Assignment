package userDefinedException;

public class Demo {
	public static void main(String [] a)
	{
		Account a1 = new Account ("Kartik" , "hin3ge");
		try {
			a1.validateUserName();
			a1.validatePassword();
		}
		catch ( InvalidUserNameException obj)
		{
			System.out.println(obj.getMessage());
		}
		catch( InvalidPasswordException obj)
		{
			System.out.println(obj.getMessage());
		}
		
	}

}
