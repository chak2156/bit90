package day03;
//작은 타입으로 변환시 쓰레기값이 나옴,메모장 참고,'a'+'A'부분도 공부해서 정리
public class Test01 {
public static void main(String[] args) {
	
	// Test01 t01 = new Test01(); 클래스 선언법
	
	int i = 224;
	byte b = 100;
	
	//묵시적,암묵적 형변환,업캐스팅
	int i2=b;
	//byte b2 = i;//컴파일오류
	
	//명시적 형변환,다운캐스팅
	byte b2=(byte)i;
	
	System.out.println(i2+" "+b2);
	
	char c ='a';
	int i3 = c;
	
	System.out.println(i3);
	
	//영대문자C에 대한 아스키코드값을 출력하시오
	
	char c2='C';
	int i4 = c2;
	System.out.println(i4);
	
}
}
