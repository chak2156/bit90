package day02;

public class DataTypeTest {
	public static void main(String[]args){
		//기본형 8가지. 소문자로 시작
		//논리형,문자형,정수,실수
		boolean bool = true;//or false
		bool = false;
		System.out.println(bool);
		
		char ch=65;//A의 아스키코드 값은 65,a는 97
		char ch2='河';
		char ch3='\u0061';//역슬레시u는 유니코드로 쓰갰다. 그 뒤의 숫자는 4자리 16진수
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		
		byte b = 127;//-128~127
		short s = 1;
		int i = 1;
		long l = 1l;//할당된 숫자에 l붙으면 long타입을 강제부여
		l=1l;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		
		float f = 1.1f; // float은 반드시 실수형 숫자 뒤에 f or F 를 붙여야 한다. 데이터의 크기 문제
		f = 1.1F;
		double d = 1.1;
		
		System.out.println(f);
		System.out.println(d);
		System.out.println(b+s+i+l+f+d);
		
	}
}
