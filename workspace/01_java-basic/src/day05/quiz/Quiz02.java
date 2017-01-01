package day05.quiz;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Quiz02 {
	public static void main(String[] args) {
		
		/*
		 * 출력방식>
		 * 바꿀 인덱스 : 2 
		 * 바꿀 인덱스 : 4
		 * 결과 : [6,8,3,9,7,4]
		 */
		Scanner sc= new Scanner (System.in);
		int[] arr = { 6, 8, 3, 9, 7, 4 };
		
		System.out.print("바꿀 인덱스 : ");
		int a=Integer.parseInt(sc.nextLine());
		System.out.print("바꿀 인덱스 : ");
		int b=Integer.parseInt(sc.nextLine());
		
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
		
		
		
		System.out.println(Arrays.toString(arr));

	}
}
