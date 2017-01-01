package day07;

import java.util.Random;

public class Sub03 {
	/*
	 * add + sub - mul * div /
	 */

	int method01(int a, int b) {

		a = a + b;
		return a;
	}

	int method02(int a, int b) {

		a = a - b;
		return a;
	}

	int method03(int a, int b) {

		a = a * b;
		return a;
	}

	int method04(int a, int b) {

		a = a / b;
		return a;
	}

	// 사칙연산 메소드
	/**
	 * @param f
	 *            연산 선택
	 * @param a
	 *            피연산자
	 * @param b
	 *            연산자
	 * @return
	 */
	int cal(char f, int a, int b) {
		if (f == '+') {
			return a += b;
		} else if (f == '-') {
			return a -= b;
		} else if (f == '*') {
			return a *= b;
		} else if (f == '/') {
			return a /= b;
		}
		return 0;
	}

	// 배열길이와 랜덤의 범위를 받아서 배열에 담아 반환
	int[] makeNumbers(int j,int k) {
		int arr[] = new int[j];
		int num = 0;
		Random r = new Random();
		for (int i = 0; i < j; i++) {
			num = r.nextInt(k) + 1;
			arr[i] = num;
		}
		return arr;
	}

}
