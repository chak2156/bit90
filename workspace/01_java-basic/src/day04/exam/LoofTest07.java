package day04.exam;

import java.util.Scanner;

public class LoofTest07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0,num2=0;
		System.out.print("수를 입력하세요 : ");
		num = Integer.parseInt(sc.nextLine());
		System.out.print("수를 입력하세요 : ");
		num2 = Integer.parseInt(sc.nextLine());
		
		for(int i=num;i<=num2;i++){
			
			for(int j=1;j<10;j++){
			
				System.out.print("	"+i*j);
			}
			
			System.out.println();
		}
	}
}