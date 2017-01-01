package day15;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Test03 {
	
	public static Map<String,Character> randomMap(){
		Map<String,Character> map = new HashMap<>();
		Random r = new Random();
		String alpha ="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i =0 ; i < 10 ; i++){
			int keyNum = r.nextInt(52);
			map.put(String.valueOf(keyNum),alpha.charAt(keyNum));
			
		}
		return map;
	}
	
	
	public static void main(String[] args) {
		Map<String,Character> map = randomMap();
		System.out.println(map);
		Set<String> keys=map.keySet();//맵에 있는걸 모두 확인하기 위해 나옴. 이거랑 밑에 둘중 하나만 기억하면 됨
		for(String key:keys){
			System.out.println("key:"+key+",value:"+map.get(key));
		}
		Set<Entry<String,Character>> entrySet = map.entrySet();//엔트리셋은 셋안의 내부클래스로 키,벨류값을 제네릭으로 갖는다
		for(Entry<String,Character>entry:entrySet){
			System.err.println(entry.getKey()+","+entry.getValue());
		}
		
		/*
		Map<String,String> map = new HashMap<>();//키값 중복허용 안함.마지막값으로 덮어씌워짐
		//보통 풋,갯,리무브 정도 알아두면됨
		map.put("name","홍길동");
		map.put("name","사람인");
		map.put("addr","구월동");
		map.put("homepage","nabo@ass.com");
		
		
		System.out.println(map);
		String name = map.get("name");
		System.out.println(name);
		System.out.println(map.get("age"));
		
		System.out.println(map.remove("name"));//삭제되는 곳의 벨류값을 리턴하고 삭제
		map.put("add",map.remove("addr"));//무브
		System.out.println(map);
*/
	}
}
