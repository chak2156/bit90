package hanstest;

import java.util.Scanner;
import java.util.Random;

public class HansTest01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("범위지정");
		int input = sc.nextInt();
		System.out.println(input);
		input = rand.nextInt(input);
		System.out.println("결과값:"+input);
		
		

		int i = 10;
		long j = 11;
		float f = 1.2f;
		i = (int) j + i + (int) f;
		f = (float) i + f + (int) j;
		System.out.println(i);
		System.out.println(j);

		int a = 10;
		int b = 5;
		int max = (a > b) ? a : b;// a와b를 비교해서? t:f
		System.out.println(max);
		// 산술연산자 a/b 는 몫을 반환, a%b는 나머지를 반환. 연산시 자동 형변환 해줌
		// 증감연산자 ++a값먼저 증가 a++값은 나중에 증가
		// 비교연산자 결과값이 불린형으로 반환
		boolean boo = (10 != 0); // 비교연산자 예 10과 0이 같지 않으므로 true반환
		System.out.println(boo);
		// boo=(i instanceof a);
		// 논리연산자 &&=and a||b=or !a=truefalse
		// 배정연산자 a+=b = a=a+b
		if (a == 10) {
			a--;
			System.out.println(a);
		} else {
			System.out.println(a);
		}
		switch (1) {
		case 1:
			break;
		}

		sc.close();
	}

}
