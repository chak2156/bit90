/*
 * E : Element
 * K : Key
 * V : Value
 * T : Type
 * N : Nnumber
 */

package day14;
//제네릭
public class Box04<K,V> {//컴파일시 객체생성부에서 받은 타입명을 꺽쇠 안에 저장. 즉 타입명을 받는 순간 클래스의 타입형이 고정됨
	private K key;
	private V value;
	public Box04(K key,V value){
		this.key =key;
		this.value = value;
	}
	public K getKey() {
		return key;
		
	}
	public V getValue() {
		return value;
		
	}



}
