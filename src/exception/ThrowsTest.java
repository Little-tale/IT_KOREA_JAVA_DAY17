package exception;

public class ThrowsTest {

	public static void main(String[] args)
	{ //메소드에서 발생할 수 있는 오류를 메소드를 사용하는 개발자 상황에 맞게
		// 처리하도록 예외 던지기.
		//예외 던지기!
		try {
			method();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		

	}
	static void method() throws InterruptedException
	{
		for (int i = 0; i<10 ; ++i)
		{
			System.out.println(i);
			Thread.sleep(500);
		}
	}
}
