package day04.exam;

import java.util.Scanner;

public class LoofTest10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
char m ='<';
char n ='>';
		System.out.println("행");
		int a = Integer.parseInt(sc.nextLine());

		System.out.println("렬");
		int b = Integer.parseInt(sc.nextLine());
		if (a % 2 == 0) {

			m = '<';
			n = '>';
			
		}
		else if (a % 2 == 1) {

		    m = '>';
		    n = '<';
		}
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++){
			System.out.print(m);
			}
		m=n;
		System.out.println();
		}

	}
}
