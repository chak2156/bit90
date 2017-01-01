package day02;

public class PrintTest {
public static void main(String[] args) {
	/*
	 * System.out.println();
	 * System.out.print();
	 * System.out.printf();
	 
	System.out.println("나의");
	System.out.print("이름은 홍\t길동 입니다.\n");
	*/
//	System.out.print("나의\n이름은\n\n홍길동 입니다.");
	//나의 이름은 홍길동이고 나이는 33세 입니다.
	String name="홍길동";
	int age=33;
	String a="%";
	System.out.printf("나의 이름은 %s 이고 나이는 %d 입니다.\n",name,age);
	System.out.println();
	System.out.printf("나의 이름은 %s 이고 나이는 %d,%s,df,50%%입니다.\n",name,age,a);
	System.out.printf("%5d\n",age);//space 5개 확보 후 그 안에 값 입력
	System.out.printf("%05d\n",age);//space 5개 확보 후 그 안에 값 입력,공백은 0 입력
	System.out.printf("|%-5d|\n",age);//뒤로 space 5개 확보 후 그 안에 값 입력
	System.out.printf("|%.2f|\n",3.14);//소숫점 둘째자리까지 표시
	System.out.printf("|%-5.2f|\n",3.14);//뒤로 space 5개 확보 후 그 안에 소숫점 둘째자리까지 표시
	
}
}
