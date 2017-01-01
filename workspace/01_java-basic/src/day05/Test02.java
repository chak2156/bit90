package day05;

public class Test02 {
	public static void main(String[] args) {

		// 정수 3개를 담는 배열을 만들고 요소로 10 20 30 넣기

		// 1번 방식 : 배열을 생설할 때 어떤 값을 입력할 지 모를 경우.
		int[] iArr = new int[3]; // 생성후
		iArr[0] = 10;// 초기화.
		iArr[0] = 20;
		iArr[0] = 30;
		// 2번 방식 : 무슨 값이 들어올지 알고 있으며 선언할때만 사용가능한 방법
		int[] iArr2 = { 10, 20, 30 };
		// iArr2={3,4,5}; 는 에러 발생
		// 3번 방식 : 잘 안쓰임. 1+2번. 선언 이후에도 사용가능.
		int[] iArr3 = new int[] { 10, 20, 30 };
		// iArr3=int[]{20,40,50}; 이게 아니고 다른방식으로 씀

	}
}
