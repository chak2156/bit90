package day15.quiz;

import java.util.Arrays;

public class Quiz04 {
	public static void main(String[] args) {
		Data temp;
		Data d1 = new Data(3);
		Data d2 = new Data(9);
		Data d3 = new Data(5);
		Data[] arr = { d1, d2, d3 };
		/*
		 *  sort의 대상이 되는 클래스는 Comparable 인터페이스의 자식 클래스이어야 한다
		 *  정렬의 기준은 compareTo 메서드에 정의한다
		 */
		String[] sArr = {"hello","test","java"};
		Arrays.sort(sArr);
		System.out.println(Arrays.toString(sArr));
		
		int[] iArr = {3,9,5};
		Arrays.sort(iArr);
		System.out.println(Arrays.toString(iArr));
		//어레이솔트에 정렬 기준을 정해줄 수 있다

	}
}