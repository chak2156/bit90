package day15.quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Quiz06 {
	public static void main(String[] args)
	{
		
		/*
		 * 파일 읽기
		 * 스플릿으로 잘라 리스트 클래스에 담는다
		 * 콜랙션으로 리스트 솔트
		 * 출력
		 * 
		 * 위도x 경도y
		 */
		
		try {
			Scanner sc = new Scanner(new File("data/day15/quiz06.txt"));
		
		while(sc.hasNextLine()){//다음 읽을 내용이 있는지 찾아 트루펄스 반환
		System.out.println(sc.nextLine());//내용 한줄 읽어 반환
		}
		
		List<QuizVO> list =new ArrayList<>();
		list.add(new QuizVO("배근영:79:88:60"));
		list.add(new QuizVO("배철수:72:84:70"));
		list.add(new QuizVO("배수민:89:78:90"));
		list.add(new QuizVO("배용준:69:88:60"));
	

		Collections.sort(list);
		System.out.println(list);
	
		/*
		 * 콜랙션 어레이리스트 데이터클래스 컴페어러블 인터페이스
		 * 
		 * 성적발표
		 * ----
		 * 1.이름:ㄹㄹ 총점:ㄹㄹ
		 * 2.
		 * 3.
		 * ----
		 */
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
