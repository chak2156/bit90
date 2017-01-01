package day04.exam;
import java.util.Scanner;
public class LoofTest05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력: ");
		int num=Integer.parseInt(sc.nextLine());
		//약수구하기
		for(int i=1;i<=num;i++){
		if(num%i==0){
			System.out.println(i);
			
		}
		}
	}

}
