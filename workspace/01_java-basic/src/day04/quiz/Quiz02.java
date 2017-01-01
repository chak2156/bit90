package day04.quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 1~1000사이의 숫자 맞추기(기회:10) 1회차.숫자를 입력하시오:
		 * 
		 */

		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		int unum = 0;
		int ans = r.nextInt(1000) + 1;
		
		System.out.printf("1~1000 사이의 숫자 맞추기");
		int i = 1;
		for (; i <= 10; i++) {
			System.out.println(" 수를 입력하세요:");
			unum = sc.nextInt();

			if (unum == ans) {
				System.out.printf("정답입니다.");
				break;
			}
			System.out.printf("%d 회 %d 보다 %s 값입니다.", i, unum, (unum < ans) ? "큰" : "작은");
		}
		if (i == 11) {
			System.out.println(" \n10회 초과. 정답은 " + ans);
		}

		sc.close();
	}

}
