package hansalgo;

import java.util.Scanner;

public class sec {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		int d = 0, h = 0, m = 0, s = 0;

		d = sec / 86400;
		h = (sec % 86400) / 3600;
		m = ((sec % 86400) % 3600) / 60;
		s = (((sec % 86400) % 3600) % 60 % 60);
		System.out.printf("%d %d %d %d", d, h, m, s);

		sc.close();
	}

}
