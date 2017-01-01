package day05.exam;
import java.util.Random;
public class ArrayTest02 {public static void main(String[] args) {
	

	Random r = new Random();
	
	int arr[]= new int[4];
	System.out.println("요소	생성된 수	출력");
	for(int i=0;i<arr.length;i++){
		arr[i]=r.nextInt(10)+1;
		System.out.print(i+"	"+arr[i]+"	");
		for(int j=0;j<arr[i];j++){
			System.out.print("*");
		}
		System.out.println();
	}
}
}
