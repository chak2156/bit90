package day04;

public class Test01 {
	public static void main(String[] args) {
		// 초기값,조건,증감
		// for문의 실행순서:초기값->조건식(2번이 참이면)->코드 수행->증감->조건식(2번이 거짓이면)-> 반복문 종료

		int i = 0;

		for (i = 1; i <= 10; ++i) {// 괄호 안에 선언된것들은 블럭 안에서 선언된것으로 생각하면 됨. 즉 블럭
									// 밖에서 못씀

				System.out.println((i % 3 == 0)?i:i*2);// 블럭 사용 안하면 if처럼 한줄만 인식됨


		}

	}

}
