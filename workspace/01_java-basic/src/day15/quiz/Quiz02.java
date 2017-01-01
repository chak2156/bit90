package day15.quiz;

import java.util.Arrays;

public class Quiz02 {
	public static void main(String[] args) {
		/*
		 * 실행시 화면출력이 9 5 3
		 */
		int[] arr = {1,3,9,5,4,2,8};
		int temp=0;

		for(int i=0;i<arr.length-1;i++){
			System.out.println(temp);
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]<arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					//비교해서 스왑
					}
				}
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
