package day05.quiz;

public class Quiz03 {
	public static void main(String[] args) {
		int[] arr = { 6, 8, 3, 9, 7, 4 };
	//	 int[] arr = { 3, 5, 7, 9};
		/*
		 * 출력형식> 배열의 모든 요소가 홀수입니다 배열의 모든 요소가 홀수는 아닙니다
		 */

		String m = "";
		for (int i = 1; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {
				m = "홀수는 아니다.";
				break;
			} else{
				m = "홀수다.";
				break;
				}
		}
		System.out.println("배열의 모든 요소가 "+m);

	
	}

}
