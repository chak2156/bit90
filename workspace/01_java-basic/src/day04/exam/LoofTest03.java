package day04.exam;
import java.util.Random;
public class LoofTest03 {
	public static void main(String[] args){
		Random r = new Random();
		int sum=0;
		for(int i=0;i<5;i++){
			sum+=r.nextInt(100)+1;
		}
		System.out.printf("%d %d",sum,sum/5);
	}

}
