package day05;

import java.util.Arrays;
import java.util.Random;

public class Test03 {
	public static void main(String[] args) {

		// 배열에 들어있는 요소 확인방법

		int[] iArr = { 10, 20, 30 };

		// 1번
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);

		}
		// 2번:향상된 for문(1.5ver이후 가능)
		// for(배열요소를 받아줌. 단순히 indexing 하는거 아님 :배열 이름) 배열의 크기(콜룸 뒤)만큼 루프를 하며
		// (콜룸)앞에 요소를 받음
		for (int i : iArr) {
			System.out.println(i);
		}
		// 둘 다 알고있되 2번 주로 사용. 예전 버전 쓸때는 1번 쓸것

		boolean[] bArr = { true, false, true };
		for (boolean i : bArr) {
			System.out.println(i);
		}

		char[] cArr = { 'a', 'b', 'c' };
		for (char i : cArr) {
			System.out.println(i);
		}
		Random[] rArr = {null,null,null};
		for (Random i : rArr) {
			System.out.println(i);
		}
		//3번: 단순히 배열에 들어간 요소값만 확인
		String data = Arrays.toString(iArr);//매개변수를 String으로 변환
		System.out.println(data);
		System.out.println(Arrays.toString(bArr));
		
		

	}
}
