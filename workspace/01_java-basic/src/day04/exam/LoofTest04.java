package day04.exam;
import java.util.Scanner;
public class LoofTest04 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("수 입력(2-10): ");
	int num=Integer.parseInt(sc.nextLine());
	System.out.printf("%d 의 배수: ",num);
	for(int i=1;i<=10;i++){
	num=num*i;
	System.out.printf("%d ",num);
	
		}
	}

}
