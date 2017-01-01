package day05.quiz;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 6, 8, 3, 9, 7, 4 };
		/*
		 * 수를 입력: 3 
		 * 배열에 1개가 들어있습니다 
		 * 
		 * 수를 입력: 1 
		 * 배열에 0개가 들어있습니다 
		 * 
		 * 수를 입력:-1
		 * 종료합니다
		 */
		for (int num = 1; num >= 0;) {
			System.out.println("수를 입력: ");
			num = Integer.parseInt(sc.nextLine());
			int count = 0;
			if (num == -1) {
				System.out.println("종료합니다.");
				break;
			}
			
			for(int i:arr) {
				if (i == num) {
					count++;
				}

			}

			System.out.println("배열에" + count + "개가 들어있습니다.");
		}

	}

}
