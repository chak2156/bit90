package day04.exam;

//3,7번 꼭
import java.util.Scanner;

public class LoofTest02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0,num2=0;
		System.out.print("수를 입력하세요 : ");
		num = Integer.parseInt(sc.nextLine());
		System.out.print("수를 입력하세요 : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		int j=0;
		
		if(num<num2){
		for(int i=num;i<=num2;i++){
			
			j=j+i;

		}
		}
		else{
			for(int i=num2;i<=num;i++){
				
				j=j+i;
				
				
			}
			}
			
		
		

		System.out.println(num+"부터"+num2+"까지의 합은"+j+"입니다.");
		
	}

}
