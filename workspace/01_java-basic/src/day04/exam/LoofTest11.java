package day04.exam;

import java.util.Random;

public class LoofTest11 {
	public static void main(String[] args) {

		Random r = new Random();
		for (int j = 1; j <= 5; j++) {
			System.out.printf("Set %d: ", j);
			int a = r.nextInt(45) + 1;
			int b = r.nextInt(45) + 1;
			int c = r.nextInt(45) + 1;
			int d = r.nextInt(45) + 1;
			int e = r.nextInt(45) + 1;
			int f = r.nextInt(45) + 1;

			while (a == b || a == c || a == d || a == e || a == f) {
				a = r.nextInt(45) + 1;
			}
			while (b == a || b == c || b == d || b == e || b == f) {
				b = r.nextInt(45) + 1;
			}
			while (c == a || c == b || c == d || c == e || c == f) {
				c = r.nextInt(45) + 1;
			}
			while (d == a || d == b || d == c || d == e || d == f) {
				d = r.nextInt(45) + 1;
			}
			while (e == a || e == b || e == c || e == d || e == f) {
				e = r.nextInt(45) + 1;
			}
			while (f == a || f == b || f == c || f == d || f == e) {
				e = r.nextInt(45) + 1;
			}

			System.out.printf("%d %d %d %d %d %d \n", a, b, c, d, e, f);
		}
	}
}
