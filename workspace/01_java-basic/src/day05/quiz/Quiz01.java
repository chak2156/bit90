package day05.quiz;

public class Quiz01 {
	public static void main(String[] args) {
		int[] arr = { 6, 8, 3, 9, 7, 4 };

		// 실행시 아래와 같이 출력되도록 프로그램 작성
		// 출력형식>
		// 최댓갑: 9
		// 최솟값: 3
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.printf("최대: %d 최소: %d", max, min);

	}
}
