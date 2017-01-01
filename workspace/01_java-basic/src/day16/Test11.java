package day16;
//close 닫기를 편하게 한 1.7버전 이상용 try문 응용 auto closer.
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test11 {
	public static void main(String[] args) {
		//Kalimba.mp3 : 약 40초 (8,414,449byte)
		//buffer : 약 0.4초
		try(
				//AutoCloseable을 상속받음
				FileInputStream fis = new FileInputStream("data/Kalimba.mp3");
				FileOutputStream fos = new FileOutputStream("data/Kalimba1.mp3");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {
			
			long s = System.currentTimeMillis();
			
			while(true){
				int ch = bis.read();
				if(ch==-1)break;
				bos.write(ch);
				
			}
			double time = (System.currentTimeMillis()-s)/1000d;
			System.out.println(time);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		
		
	}

}
