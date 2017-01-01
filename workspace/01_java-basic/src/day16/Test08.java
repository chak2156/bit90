package day16;
//파일 바이트단위 복붙
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test08 {
	public static void main(String[] args) {
		//Kalimba.mp3 : 약 40초 (8,414,449byte)
		FileInputStream fis = null; // 리더로 받으면 죠땜
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("data/Kalimba.mp3");
			fos = new FileOutputStream("data/Kalimba1.mp3");
			long s = System.currentTimeMillis();
			while(true){
				int ch = fis.read();
				if(ch==-1)break;
				fos.write(ch);
				
			}
			double time = (System.currentTimeMillis()-s)/1000d;
			System.out.println(time);
		} catch (Exception e) {
			// TODO: handle exception
			e.getStackTrace();
		}
		finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	
			if(fos != null){
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
