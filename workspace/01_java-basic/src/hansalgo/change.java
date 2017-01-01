package hansalgo;

import java.util.Scanner;

public class change {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		int money = 1000;
		int change = money - price;

		int c100 = 0, c50 = 0, c10 = 0;
		System.out.println(change);
		c100 = change / 100;

		c50 = (change % 100 / 50);

		c10 = ((((change) % 100) % 50) / 10);
		System.out.printf("%d %d %d\n", c100, c50, c10);
		sc.close();
	}
}
