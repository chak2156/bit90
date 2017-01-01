package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();// 콜랙션과 마찬가지로 인터페이스 개념. 해시 셋과 트리 셋 둘중 하나로 구현됨. 중복 비허용
		//set은 인덱싱을 따로 하지 않는다
		System.out.println(set.add("one"));
		System.out.println(set.add("two"));
		System.out.println(set.add("three"));
		System.out.println(set.add("two"));//중복되서 false
		System.out.println(set);
		set.remove("one");//인덱스 접근하는 인자가 없다. 
		for(String s : set){
			System.out.println(s);
			
		}
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next());
		}
	}
}
