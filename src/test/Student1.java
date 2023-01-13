package test;




class Student1
{
	//필드
	int math;
	int kor;
	int eng;
	String grade;
	double avg;
	
	
	// 생성자
	public Student1(int math, int kor, int eng, String grade, double avg) {
		super();
		this.math = math;
		this.kor = kor;
		this.eng = eng;
		this.grade = grade;
		this.avg = avg;
	}

	
	
	
	//메소드
	@Override
	public String toString()
	{
		//return "난 학생이다! " ;
//		return super.toString(); //참조값 확인할 수 있다.
		return "점수: 수학 = " + math + ","+"국어 = "+kor + ","+"영어 = "+ eng;
	
	
	
	}
	
	
	
	public static void main(String[] args) 
	{	Student1 st = new Student1(100,90,80,"A+", 35.2);
	
		System.out.println(st.toString());
		
		
		
		
//		System.out.println(Object x); //Object클래스의 메소드 확인.
		
	}
	
	
	
	
	
}





