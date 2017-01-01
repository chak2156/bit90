package day05;

import java.util.Arrays;

public class Test04 {
	public static void main(String[]args){
		//배열의 요소값 복사
		String[] Arr = {"호식이","페리카나","깻잎","비비큐"};
		
		String[] dest = new String[Arr.length];
		
//		for(int i=1;i<Arr.length;i++){
//			dest[i-1]=Arr[i];
//		}
		
		//배열 복사용 api 원본의 배열(1)의 요소 시작위치(2),복사받을(3)배열의 요소 시작위치(4),길이(5)
		System.arraycopy(Arr, 0, dest, 1, 3);
		System.out.println(Arrays.toString(dest));
		
		
	}
	

}
