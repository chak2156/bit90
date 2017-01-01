package day07;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		Sub03 s03 = new Sub03();
		Random r = new Random();
		int a = 8, b = 2;
		
		int temp = r.nextInt(5)+1;

		System.out.println(s03.method01(a, b));
		System.out.println(s03.method02(a, b));
		System.out.println(s03.method03(a, b));
		System.out.println(s03.method04(a, b));
		System.out.println(s03.cal('+', a, b));
		System.out.println(s03.cal('-', a, b));
		System.out.println(s03.cal('*', a, b));
		System.out.println(s03.cal('/', a, b));
		System.out.println();

		
		 int[] arr = s03.makeNumbers(temp,temp);
		 System.out.println(Arrays.toString(arr)); 
		

	}

}
