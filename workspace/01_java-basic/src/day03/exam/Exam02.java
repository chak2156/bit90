package day03.exam;

import java.util.Scanner;

public class Exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("초를 입력하세요 :");
		String input = sc.nextLine();
		int sec = Integer.parseInt(input);
		// int sec = 3661;
		int hour = sec / 3600;
		int min = (sec % 3600) / 60;
		int sec2 = ((sec % 3600) % 60);
		System.out.printf("%d 초는 %d시간 %d분 %d초입니다.\n", sec, hour, min, sec2);
		sc.close();
	}

}
