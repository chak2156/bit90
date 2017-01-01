package day05.quiz;

import java.util.Arrays;

public class ExQuiz {
public static void main(String[] args) {
	int[] arr = {3,1,9,4,5};
	//54913으로 스왑되게
	/*
	arr[0]=arr[0]+arr[4];
	arr[4]=arr[0]-arr[4];
	arr[0]=arr[0]-arr[4];
	arr[1]=arr[1]+arr[3];
	arr[3]=arr[1]-arr[3];
	arr[1]=arr[1]-arr[3];
	*/
	
for(int i=0;i<arr.length/2;i++){
	arr[i]=arr[arr.length-i-1]+arr[i];	
	arr[arr.length-i-1]=arr[i]-arr[arr.length-i-1];
	arr[i]=arr[i]-arr[arr.length-i-1];
	
}
	
	System.out.println(Arrays.toString(arr));
	
}
}
