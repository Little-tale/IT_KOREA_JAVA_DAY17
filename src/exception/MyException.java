package exception;

public class MyException extends Exception
{	
	/**
	 * Error code : 001
	 */
	private static final long serialVersionUID = 1L;

	public MyException()
	{
		super("음수는 입력할 수 없습니다.");
	}
	
}
