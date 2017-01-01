package day03.exam;

import java.util.Random;

public class Exam09 {
	public static void main(String[] args) {
		
		int num = new Random().nextInt(100) + 1;
		System.out.printf("생성된 숫자(%d) 은", num);
		if (num % 2 == 0) {
			System.out.println(" 짝수 입니다.");
		} else {
			System.out.println(" 홀수 입니다.");
		}
		//개선된 코드 - 조건에 따라 변경되는 부분만 조건식에 넣어라
		String type;
		if (num % 2 == 0) {
			type = "짝수";
		} else {
			type = "짝수";
		}
		
		System.out.println("생성된 수: "+num+" 은 "+type+" 입니다");
		//짧아진 코드.삼항연산자
		
		System.out.println((num % 2 == 0)?"짝수":"홀수");
	}

}
