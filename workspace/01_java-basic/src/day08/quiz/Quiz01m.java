package day08.quiz;

import java.io.File;
import java.util.Scanner;

public class Quiz01m {
	public static void main(String[] args) throws Exception {
		findFileCount("java");
		findFileCount("txt");
		findFileCount("jpg");
	}
	public static void findFileCount(String ext) throws Exception{
		File f = new File("data/day08/quiz/quiz01.txt");
		Scanner sc = new Scanner(f);
		int count=0;
		while(sc.hasNextLine()){
			String readline = sc.nextLine();//한줄씩 읽는다
			if(readline.endsWith(ext)){//
				
			count++;
			
			}
			
		}
		System.out.println(ext+" "+count);
		
		
	}

}
