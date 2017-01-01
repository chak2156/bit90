package day15.quiz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Quiz01 {
	public static void main(String[] args) {
		//set을 활용한 로또 번호 추출
		//1~45랜덤한 숫자 6개 생성
		Set<Integer> set = new HashSet<>();
		Random r =new Random();
		int num;
		int loop = 0;
		
		while(set.size()<6){
			set.add(r.nextInt(45)+1);
		}
		System.out.println(set);
		set.removeAll(set);

		
		
		
		for(int i=0;i<7;i++)
		{
			set.add(r.nextInt(45)+1);
			if (set.size()==6)break;
		}
		
		for(int s : set){
			System.out.println(s);
		}
		
	}

}
