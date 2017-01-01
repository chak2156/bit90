package day16;

import java.io.File;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		File f = new File("data/a1.txt");
		
		boolean result = f.delete();
		if(result){
			System.out.println("성공");
		}
		else{
			System.out.println("실패");
		}
		/*
		System.out.println(f.getPath());//getPath = 모든 경로를 문자열로 출력
		System.out.println(f.getName());//경로 마지막의 디랙토리or파일을 문자열로 출력
		System.out.println(f.getParent());//경로 마지막 디랙토리or파일의 상위 디랙토리를 문자열로 출력
		
		long length = f.length();//byte의 크기 반환
		System.out.println(f.length());
		if(!f.exists()){//논리연산자 ! 으로 트루 펄스를 반대로 바꿈
			System.out.println("파일 생성");
			try {
				boolean creatfile = f.createNewFile();
				if (creatfile){
					System.out.println("생성 성공");
				}
				else{
					System.out.println("파일 생성 실패");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	*/
		
		
	}
}
