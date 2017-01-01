package hanstest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class ImageViewer {
	public static void main(String[]args){
		
		Set<Integer> set =new HashSet<>();
		Random r = new Random();
		int i=0;
		while(i<6){
			set.add(r.nextInt(45)+1);
			if(set.size()!=0){
				i++;
			}
			
		}
		for(int j=0;j<set.size()-4;j++){
			System.out.println(j);
		}
		for(int s : set){
			System.out.println(s);
		}
	}
}
