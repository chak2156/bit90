package day08.quiz;

import java.io.File;
import java.util.Scanner;

public class Quiz02m {
	public static void main(String[] args) throws Exception {
		//실행시에 아래와 같은 결과가 출력되도록 코드를 작성하시오
		/*
		 * 전체 상영된 영화 4편
		 * 제목이 2글자인 영화 2편
		 * 
		 */
		
		
		
		
		
		
		int count=0;
		int count2=0;
		
		File f = new File("data/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){
			String readLine = sc.nextLine();
			
			String[] check=readLine.split(":");
				int a = check[0].length();
				if (a==2)count2++;

				count++;
			
		}
				System.out.printf("전체 상영된 영화 %d 편 \n",count );
				System.out.printf("제목이 2글자인 영화 %d 편 \n",count2 );
	}

}
