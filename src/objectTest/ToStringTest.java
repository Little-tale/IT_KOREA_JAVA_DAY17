package objectTest;

public class ToStringTest
{	public ToStringTest()
	{	
		super();
	}


public static void main(String[] args)
	{
		String str = "aa";
		ToStringTest t = new ToStringTest();
		System.out.println(t);
		
		try 
		{
			throw new NumberFormatException("안녕!!");
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}
