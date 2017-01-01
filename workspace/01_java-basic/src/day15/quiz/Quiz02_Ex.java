package day15.quiz;

import java.util.Arrays;

public class Quiz02_Ex {
	public static void main(String[] args) {
		int[] arr = {1,3,9,5,4,2,8};
		int temp=0;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				System.out.println(Arrays.toString(arr));
				
			}
		}


		System.out.println(Arrays.toString(arr));
	}

}
