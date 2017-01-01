package day08.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz02 {
	
	public static void getMovieCountByNameLength(int len) throws FileNotFoundException{
		
		int count2=0;
		
		File f = new File("data/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){
			String readLine = sc.nextLine();
			String[] check=readLine.split(":");
			int a = check[0].length();
			if (a==len)count2++;
		}
		
		System.out.printf("제목이 %d 글자인 영화 %d 편 \n",len,count2 );
	}
	public static void getMovieCountByYear(int year) throws FileNotFoundException{
		
		int count2=0;
		
		File f = new File("data/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){
			String readLine = sc.nextLine();
			
			String[] check=readLine.split(":");
			int a =Integer.parseInt(check[2]);
			if (a==year)count2++;
			
			
			
		}
		
		System.out.printf("%d 에 개봉한 영화 %d 편 \n",year,count2 );
	}
	public static void totalMovieCount() throws FileNotFoundException{
		
		
		int count=0;
		
		File f = new File("data/day08/quiz/quiz02.txt");
		Scanner sc = new Scanner(f);
		while(sc.hasNextLine()){
			sc.nextLine();
				count++;
			
		}
				System.out.printf("전체 상영된 영화 %d 편 \n",count );
				
	}
	
	
	public static void main(String[] args) throws Exception {
		//실행시에 아래와 같은 결과가 출력되도록 코드를 작성하시오
		/*
		 * 전체 상영된 영화 4편
		 * 제목이 2글자인 영화 2편
		 * 
		 */
		
		totalMovieCount();
		getMovieCountByNameLength(2);
//이 년도에 상영한 영화는 몇편이다		
		getMovieCountByYear(2016);
		

	}

}
