package day03;

public class Test03 {
public static void main(String[] args) {
	
	//배정연산자 (a+=b)
	int a = 10;
	
	a*=3+4; //여기서 *는 배정연산자, +는 산술연산자. 배정연산자는 우선순위가 가장 낮다. 마지막에 할 연산을 정해놓을 때 쓸듯
	System.out.println(a);
	
	//논리연산자 (&&,||)
	
	/*
	int a=10;
	int b=5;
	boolean bool = (a<10 && b++ == 5); //and연산은 앞이 false면 뒤는 연산하지 않음
	//boolean bool = (a<10 & b++ == 5); //비트연산에서 주로 씀. 뒤가 false여도 연산
	
	System.out.println("bool:"+bool);
	System.out.println("a:"+a);
	System.out.println("b:"+b);
	*/
	
	
	//비교연산자 (==,!=)
	
	/*
	int a=10;
	int b=20;
	
	System.out.println((a==b)?"같다":"다르다");
	System.out.println((a!=b)?"다르다":"같다");
	
	boolean flag=false;
	System.out.println((flag == false)?"false":"true");
	System.out.println((flag = false)?"false":"true");//구문오류가 나지 않는 버그
	*/
	
	//증감연산자 ++a면 a+1하고 피대입자에게 대입
	
	//산술연산자 (-,+,*,/,%) 
	
	/*
	byte b=1;
	byte b2=2;
	//byte b3=b+b2;//산술연산시 int보다 작은 자료형은 int로 변형되기 때문에 오류가 난다
	byte b3=(byte)(b+b2);
	
	System.out.println(1%2);
	System.out.println(2%2);
	System.out.println(3%2);
	System.out.println(4%2);
	System.out.println(5%2);//루프시키면 홀짝만들기, 나머지0일때 배수구하기,공배수 구하기 등..
	
	System.out.println((1%2==0)?"짝수":"홀수");
	
	int val = 1;
	System.out.println(val++%2);
	System.out.println(val++%2);
	System.out.println(val++%2);
	System.out.println(val++%2);
	System.out.println(val++%2);
	
	System.out.println((val%2==0)?"짝수":"홀수");
	*/
	//삼항연산자 ( (조건)?T일시 선택됨:F일시 선택됨)
	
	
	/*
	int a= 5;
	int b= 5;
	
	String result =(a>b)?"a는b보다 크다":(a==b)?"같다":"작다";//3항연산자의 중첩사용. if문과 비슷한 구조
	*//*
	int result=0;//조건식 연산후 T면 좌,F면 우 출력
	
	System.out.println(result=(a<b)?a:b);
	
	System.out.println(result);
	*/
	
	
}
}
