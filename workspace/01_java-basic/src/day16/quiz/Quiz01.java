package day16.quiz;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Quiz01 {
	public static void main(String[] args) {
		//프로그램 실행시 현재 날짜 정보를 기준으로 디렉토리 생성
		//출력결과
		/*
		 * data/2016/12/26/09 폴더 생성
		 * 
		 */
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy/MM/dd/HH");
		String fath ="data/"+sdf.format(new Date());
		File f = new File(fath);
		if(f.exists()){
		}else{
		if(f.mkdirs()){
			System.out.println("ㅇㅇ");
		}
		else{
			System.out.println("ㄴㄴ ,");
		}
			}
		
			

	}
	
}
