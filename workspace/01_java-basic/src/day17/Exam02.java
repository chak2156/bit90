package day17;

import java.io.FileReader;

public class Exam02 {
    public static void main(String[] args) {
        try {
            searchFileContent("data/find.txt", "System");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /**
     * 
     * @param readFileName : 읽을 파일명
     * @param findStr      : 파일에서 찾을 내용
     * @throws Exception
     */
    public static void searchFileContent(String readFileName, String findStr) throws Exception {
            
    	FileReader fr = new FileReader(readFileName);
    	String sd = "";
    	String sd2 = "";
    	boolean flag = true;
		
		String[] sarr;
		while (true) {
			Character ch = (char)fr.read();
			sd=sd+ch.toString();
			
			sd.split("\n\r");
			if(ch==((char)-1))break;
		}
		sarr = sd.split("\n");
		for(int i = 0 ;i<sarr.length;i++){

		if(sarr[i].contains(findStr)){
			System.out.println(sarr[i]);
		}

		}
    }
}
