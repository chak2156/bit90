package day05.exam;

import java.util.Random;

public class ArrayTest03 {
	public static void main(String[] args) {

		int arr[] = new int[45];
		Random r = new Random();
		System.out.println(r.nextInt(arr.length) + 1);
		

		for (int i = 0; i < 10000; i++) {
			int num=0;
			num=r.nextInt(arr.length)+1;
			arr[num-1]++;
		}
		for (int j = 0; j < arr.length; j++) {
			System.out.println((j+1) + " " + arr[j]);
		}
	}
}
