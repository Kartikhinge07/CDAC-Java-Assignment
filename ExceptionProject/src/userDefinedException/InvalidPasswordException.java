package userDefinedException;

public class InvalidPasswordException extends RuntimeException {
	@Override
	public String getMessage()
	{
		return " PassWord Is Not Valid ";
	}


}
