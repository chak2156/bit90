package day02;

public class VariableScopeTest 
{
	
	int a = 10;
	public static void main(String[] args) 
	{
		//자바는 실행시간에 인터프리터를 사용해서 변수 선언 전에는 사용이 불가능 할 것이다
		//일반적으로 선언된 블락 안에서만 사용가능
		 
		{//블락은 굳이 메소드 없어도 사용 가능
			int a = 10;
			System.out.println(a);
		}
		int a = 10;
		System.out.println(a);
		
	}

}
//2,1,8오류,3,1 -수업중 퀴즈 말하는듯