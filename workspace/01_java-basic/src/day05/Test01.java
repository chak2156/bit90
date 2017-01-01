package day05;

//import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
//		Random r = new Random();
//		Random[] rArr = new Random[4];
		System.out.println(iArr.length);
		System.out.println(iArr[0]);

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = (i + 1) * 10;
			System.out.println(iArr[i]);
		}

		
//		for (int i = 0; i < rArr.length; i++) {
//			rArr[i] = r; // 이걸 어따쓰지
//			System.out.println(rArr[i]);
//		}
		

		String[] sArr = new String[4];

		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = "java";
			System.out.println(sArr[i]);
		}

	}
}
