package day03.exam;

import java.util.Scanner;

public class Exam03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("반지름:");

		String s = sc.nextLine();
		int r = Integer.parseInt(s);
		float pi = 3.141592f;

		float result = pi * r * r;
		System.out.println("지름:" + result);
		sc.close();
		

	}

}
