package lamda;

import java.util.Scanner;

import javax.imageio.stream.FileImageInputStream;

public class Task {
	// 2개의 정수를 매개변수로 받아서 곱한 결과를 반환하는 메소드
	// 람다식 이용
	// FunctionalInter를 이용하기
	
	// 새로운 함수형 인터페이스 (FunctionalInter3) 만들고
	// 2개의 문자열을 매개변수로 전달받는 추상 메소드를 선언한다.
	//"안녕" "하세요"
	
	
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
//		int num1 = sc.nextInt();
//		int num2 = sc.nextInt();
		FuncionalInter FI2 =(num1,num2)->
		{
			System.out.println("람다식 이용");
			return num1 * num2;
		};
		
		int result = FI2.method(20, 100);
		System.out.println(result);
	}
	
	
	Functional3 FIII = (s1,s2) -> System.out.println(s1 + s2);
	
//	FIII.
	
	

}
