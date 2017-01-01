package day04.exam;
import java.util.Random;
public class LoofTest09 {
	public static void main(String[] args) {
		
	
	Random r = new Random();
	boolean b=true;
	int num = r.nextInt(10)+10;
	for(int i=2;i<num;i++){
		b=(num%i==0)?true:false;
		if(b==true){break;}
	
	}if(b==false)System.out.println(num);
	}
}
