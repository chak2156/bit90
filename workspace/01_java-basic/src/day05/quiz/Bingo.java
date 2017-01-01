package day05.quiz;

import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("1인용 빙고 시작");//5*5빙고판
		int maxHigth=5;
		int maxWidth=5;	
		int index=maxHigth*maxWidth;
		int[] iArr= new int[index];
		
		//숫자 섞기
		for(int s=0;s<index;s++){
			int temp=r.nextInt(25);
			iArr[temp]=temp;
			iArr[s]=temp;
			
		}
		
		
		
		//출력
		for(int higth=0;higth<maxHigth;higth++){
			for(int width=0;width<maxWidth;width++){
				if((maxWidth*higth)+iArr[width]==0){
					
					System.out.print("*"+"	");
				}else{
				System.out.print((maxWidth*higth)+iArr[width]+"	");}
				
			}
			System.out.println();
		}
		System.out.println("번호 입력");
		
	}

}
