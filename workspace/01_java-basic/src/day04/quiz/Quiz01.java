package day04.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		// 1~10까지의 합을 구하시오
		// 출력형식>
		// 1~10 까지의 합 :55
		// 짝수의 합:30
		// 홀수의 합:25
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				even += i;
				continue;//메모리 관리. 포문인지 이프문인지 끝까지 돌기때문에 중간에 스킵
			} else {
				odd += i;
			}

		}
		System.out.println(even + odd);
		System.out.println(even);// ghf
		System.out.println(odd);// Wkr

	}

}
