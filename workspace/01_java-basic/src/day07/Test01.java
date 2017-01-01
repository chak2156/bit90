package day07;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		Random r =new Random();
		Sub01 s01 = new Sub01();
		s01.method01();
		s01.method02(1);
		s01.method03(2, 3);
		s01.method04('s');
		s01.method05("호우");
		s01.method06(r);
		
		

	}
}
