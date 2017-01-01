package day03.exam;

import java.util.Scanner;

public class Exam04 {
	public static void main(String[] args) {
		/*
		 * 화면에서 하나의 정수를 입력 받고 정수를 나눌 수를 입력 받은 다음 몫과 나머지를 화면 에 출력하시오 출력형식 > 정수를
		 * 입력하세요 : 10 나눌 수를 입력하세요 : 7 몫 : 1 나머지 : 3
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 :");
		String input = sc.nextLine();
		int a = Integer.parseInt(input);
		System.out.print("나눌 수를 입력하세요 : ");
		input = sc.nextLine();
		int b = Integer.parseInt(input), c = 0, d = 0;
		c = a / b;
		d = a % b;
		System.out.printf("몫: %d \n나머지: %d \n", c, d);
		
		sc.close();
	}

}
