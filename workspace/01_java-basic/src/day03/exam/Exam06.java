package day03.exam;

import java.util.Scanner;

public class Exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("물건값을 입력하세요(만원):");
		String some = sc.nextLine();
		// float money = Float.parseFloat(some);
		int money = Integer.parseInt(some);
		if (money < 10) {
			money = (int) ((money * 10000) - ((money * 0.03) * 10000));
			System.out.println("할인된 금액은 " + money+"입니다.");

		} else if (money < 21) {
			money = (int) ((money * 10000) - ((money * 0.05) * 10000));
			System.out.println("할인된 금액은 " + money+"입니다.");
		} else if (money < 31) {
			money = (int) ((money * 10000) - ((money * 0.08) * 10000));
			System.out.println("할인된 금액은 " + money+"입니다.");
		} else if (money > 100) {
			money = (int) ((money * 10000) - ((money * 0.1) * 10000));
			System.out.println("할인된 금액은 " + money+"입니다.");
		}
		sc.close();
	}
}
