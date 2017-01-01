package day16;
//인풋스트림,리더의 차이점 알아볼것
import java.io.FileInputStream;//인트형으로 입력받음
import java.io.FileReader;//캐릭터형으로 입력받음
import java.io.IOException;

public class Test05 {
	public static void main(String[] args) {
		FileReader fis = null;
		try{//try,fanally 같이 사용하기 위해 FileInputStream을 밖으로 뺌
			fis = new FileReader("data/a.txt");//
			while(true){
				int ch = fis.read();
				if(ch==-1)break;
				System.out.println((char)ch);
				
				
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			//입,출력 닫기. 1.7버전 이하에서 사용가능. io프로세스간 충돌방지
			if(fis!=null){
			try {
				
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}
}
