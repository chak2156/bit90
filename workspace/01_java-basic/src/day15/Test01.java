package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test01 {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();
	list.add("one");//스트링 형태의 자료 삽입
	list.add("two");
	list.add("three");
	list.add("three");
	System.out.println(list.get(1));//배열1의 자료 출력
	list.remove(0);
	System.out.println(list.size());
	System.out.println(list.get(1));
	list.remove("three");
	System.out.println(list);//toString 호출
	list.add(0,"one");
	list.add(1,"one");
	System.out.println(list);//toString 호출
	list.clear();
	System.out.println(list);//toString 호출
	List<String> sub = new ArrayList<>();
	sub.add("two");
	sub.add("three");
	list.addAll(sub);//sub에 있는 리스트를 list에 추가
	System.out.println(list);//toString 호출
	System.out.println(list.isEmpty());//비어있나 확인. 불린형으로 리턴됨
	System.out.println(list.contains("two"));//해당 자료가 있는지 확인. 불린형으로 리턴됨
	System.out.println(list.indexOf("one"));//해당 자료의 인덱스 확인. 없으면 -1
	//리스트의 데이터값 확인
	//밑의 세 반복문(for,Iterator,for1.5ver) 숙지
	
	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
	for(int i=0,size =list.size();i<size;i++){//메소드 호출을 최소화
		System.out.println(list.get(i));
	}
	
	Iterator<String> ite = list.iterator();//iterator : 순환자. 처음부터 끝까지 읽고 끝
	//hasNext메소드로  다음파일 읽을게 있냐 불린형 반환 확인하여 Next메소드로 호출자에게 현재 위치?값?둘중하나 반환하고 다음 포인트로 이동
	
	while(ite.hasNext()){
		System.out.println(ite.next());
	}
	
	for(String s : list){
		System.out.println(s);
	}	
	
	
}
}
