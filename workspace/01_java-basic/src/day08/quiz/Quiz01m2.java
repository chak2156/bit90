package day08.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz01m2 {
	public static void main(String[] args) throws FileNotFoundException {
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

public static void findFileCount(String check) throws FileNotFoundException{
	File f = new File("data/day08/quiz/quiz01.txt");
	Scanner sc = new Scanner(f);
	int count=0;
	String line="";
	while(sc.hasNextLine()){
		line=sc.nextLine();
		if(line.endsWith(check))count++;
	}
	System.out.println(check+" "+count);
	
	
	

}
}