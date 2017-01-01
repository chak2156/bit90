package day03.exam;

import java.util.Random;

public class Exam08 {
	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(100) + 1;
		System.out.print("점수:" + a);
		if (a < 60) {
			System.out.println("점(불합격)");
		} else
			System.out.println("점(합격)");
	}
}
