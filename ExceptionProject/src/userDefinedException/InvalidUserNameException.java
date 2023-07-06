package userDefinedException;

public class InvalidUserNameException extends RuntimeException
{
	@Override
	public String getMessage()
	{
		return " UserName Is Not Valid ";
	}


}

	


