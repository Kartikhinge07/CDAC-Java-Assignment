package ques2;
import java.util.*;
public class Password {

	String Pass ;
	public Password(String pass)
	{
		this.Pass=pass;
	}

	public boolean validatePassword() throws PasswordTooLongException ,PasswordTooShortException
	{

		if(Pass.length()<8)
		{
			throw new PasswordTooShortException();
		}
		if(Pass.length()>12)
		{
			throw new PasswordTooLongException();

		}
		return false;
	}



	public static void main(String []a)
	{
		try {
			Password p1 = new Password("kartik345");
			p1.validatePassword();
			System.out.println("Valid Password ");
		}
		catch (PasswordTooLongException obj )
		{
			System.out.println(obj.getMessage());
		}

		catch (PasswordTooShortException obj )
		{
			System.out.println( obj.getMessage());
		}

	}


}
