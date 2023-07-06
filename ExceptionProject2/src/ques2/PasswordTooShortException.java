package ques2;

public class PasswordTooShortException extends Exception {
	@Override
	public String getMessage()
	{
		return "Password is too Short";
	}

}
