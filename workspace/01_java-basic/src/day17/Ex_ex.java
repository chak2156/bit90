package day17;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex_ex {
	public static void main(String[] args) {
		
	try {
		FileReader fr = new FileReader("data/exam01.txt");
		
		try {
			while(true){
				
			int ch = fr.read();
			if(ch==-1)break;
			System.out.print(ch);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
