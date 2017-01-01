package day16;

import java.io.File;

public class Test02 {
	public static void main(String[] args) {
		File f = new File("data");
		File[] fList = f.listFiles(); //파일 안의 경로를 file형 문자열 배열로 저장
		for(File sub:fList){
//			if(sub.isDirectory()){
//				type="D";
//			}
//			else{
//				type="F";
//			}
			
			
			System.out.printf("%s:%s\n",sub.isDirectory()?"D":"F",sub.getName());
		}
		
//		String[] list= f.list();//File.list메서드:알파벳순으로 정렬하여 캐릭터 배열형으로 저장됨
//		for(String name : list){
//			String dd="data/"+name;
//			
//			System.out.println(name);
//			
//		File d = new File(dd);
//		if(d.isDirectory()){
//			System.out.println("디렉토리");
//		}
//		else if(d.isFile()){
//			System.out.println("파일");
//		}
//		}
//		
	}
}
