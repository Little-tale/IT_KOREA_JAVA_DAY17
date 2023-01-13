package lamda;

public class Main {

	public static void main(String[] args)
	{
	
		Funcional Fi = number -> number + 10;
		System.out.println(Fi.add10(100));
		
		int num = Fi.add10(100);
		//int num1 = 0, num2 =10;
		FuncionalInter FII = (num1,num2) -> {
			System.out.println("람다식");
			return num1 + num2 ; 
		};
		
			
		
				
		
		
		
		
	
	}

}
