package day03.exam;

import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int num = Integer.parseInt(s);
		if (0 > num) {
			num = -num;
		}
		System.out.println(s + " 의 절대값 : " + num);
		sc.close();
	}
}
