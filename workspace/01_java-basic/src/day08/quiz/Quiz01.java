package day08.quiz;

import java.io.File;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) throws Exception{
		/*
		 * data/day08/quiz/quiz01.txt 내용 출력
		 * java파일은 2개 입니다
		 * txt파일은 1개 입니다
		 * jpg파일은 1개 입니다
		 */
	
		findFileCount("java");
		findFileCount("txt");
		findFileCount("jpg");
		
	}
	public static void findFileCount(String ext) throws Exception{
		File f = new File("data/day08/quiz/quiz01.txt");
		Scanner sc = new Scanner(f);
		int count=0;
		while(sc.hasNextLine()){//다음 읽을 내용이 있는지 찾아 트루펄스 반환
			String find = sc.nextLine();
			if(find.endsWith(ext))count++;
		
	}
		System.out.println(ext+" "+count);//내용 한줄 읽어 반환}
	}
}
