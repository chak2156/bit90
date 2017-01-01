package day04;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {

		/*
		 * 화면출력> ********
		 * 
		 * 별 개수 5:피라미드
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int input = sc.nextInt();
		/*
		 * for (int i = 1; i <= input; i++) { for (int j = 1; j <= i; j++) {
		 * System.out.print("*"); } System.out.println(); }
		 */
		for (int i = 1; i <= input; i++) {
			/*
			for (int k = input; k >= i; k--) {
				System.out.print(" ");

			}*/
			for(int k = 1;k <=input-i ;k++){
				
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}

		sc.close();

	}

}
