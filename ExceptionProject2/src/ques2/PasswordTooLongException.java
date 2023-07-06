package ques2;

public class PasswordTooLongException extends Exception{
	@Override
	public String getMessage()
	{
		return "PassWord is too long ";
	}
	

}


