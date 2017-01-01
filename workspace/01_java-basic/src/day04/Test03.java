package day04;

//import java.util.Random;
public class Test03 {
	public static void main(String[] args) {

		// 반복문 빠져나가기:break
		// 반복문의 나머지 부분 무시하기
		/*
		 * Random r = new Random();
		 * 
		 * int num = r.nextInt(9)+1;
		 * 
		 * System.out.println("num:"+num);
		 * 
		 * for (int i = 1; i < 10; i++) {
		 * 
		 * System.out.println(i); if(i==num) break; } System.out.println("");
		 * for (int i = 1; i < 10; i++) {
		 * 
		 * if(i==num) continue; System.out.println(i);
		 * 
		 * }
		 */

		outer : // 반복문에 네임택 넣기. 중첩된 반복문 빠져나갈때 사용
			for (int i = 0; i < 3; i++) {
			System.out.println("i= " + i);
			for (int k = 0; k < 3; k++) {
				System.out.println("k= " + k);
				if (k == 1)
					break outer;//자신과 연관된 특정한 이름을 가진 반복문을 break한다. continue도 가능
			}

		}
	}

}
