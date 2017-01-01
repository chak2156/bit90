package day16;
import java.io.File;
public class Test01 {
	public static void main(String[] args) {
		File f = new File("data/mya/aa/bb");
		boolean bool = f.exists();//file 객체가 지정한 객체가 존재하는지 검색
		 if(bool==true){
			 System.out.print("있음, ");
			 
			 if(f.isDirectory()){
				 System.out.println("디렉토리임.");
			 }
			 if(f.isFile()){
				System.out.println("파일임.");
			}
			 
		 }
		 else{
			 System.out.print("없음, ");
//			 if(f.mkdir()){
//				 System.out.println("디랙토리 생성 성공");
//			 }//make directory. 경로 생성. 중간경로가 여러개면 생성하지 못함
			 if(f.mkdirs()){
				 System.out.println("디랙토리 생성 성공");
			 }
			 else{
				 System.out.println("디랙토리 생성 실패");
			 }
		 }
		
	}
}
