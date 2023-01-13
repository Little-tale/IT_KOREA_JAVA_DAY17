package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args)
	{Scanner sc = null;
		try
		{
			//Scanner sc = null;
			sc.next();
		}
		catch (NullPointerException e)
		{
			System.err.println("비어있는 참조주소값.");
			System.out.println(e.getMessage());
			System.out.println(e);
			e.printStackTrace();
		}catch(Exception e)
		{
			System.out.println("예상치 못한 오류");
			//최상위 부모인 이셉션을 이용해 오류를 예상하지 못했을때
			// 에상치 못한 오류를 잡기 위해서 이셉션 타입의 매개변수를 사용한다.
			// 모든 예외의 조상은 이셉션 클래스
			// 즉. 어떤 예외가 발성하더라도 이셉션 타입의 찹조변수에 저장가능
				// (업 캐스팅)
		}
		
		System.out.println("실행시키고 싶은 명령어");

	}

}
