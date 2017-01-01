package day03.quiz;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {

		// 화면에서 아래와 같이 출력될 수 있도록 코딩을 작성하시오
		/*
		 * 조건:5000 미만 입력시 치즈버거,5000~10000은 불고기,10000이상은 패밀리세트 kfc에 어서오세요 현재 가진
		 * 돈을 입력하세요: _3500 치즈버거를 살 수 있습니다. 현재 가진 돈을 입력하세요: _5100 불고기 버거 세트를 살 수
		 * 있습니다. 현재 가진 돈을 입력하세요: _10100 패밀리 세트를 살 수 있습니다.
		 */
		Scanner sc = new Scanner(System.in);

		System.out.print("kfc에 어서오세요.\n현재 가진 돈을 입력하세요.");
		String input = sc.nextLine();
		int money = Integer.parseInt(input);
		if (money < 5000) {
			System.out.println("치즈버거를 살 수 있습니다.");
		} else if (money > 10000) {
			System.out.println("패밀리세트를 살 수 잇습니다.");
		} else {
			System.out.println("불고기버거를 살 수 있습니다");
		}
		sc.close();

	}
}
