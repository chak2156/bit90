package day14;

import org.omg.CORBA.INTERNAL;

public class Test05 {
public static void main(String[] args) {
	//Wrapper 클래스
	//기본형에 대한 참조타입 클래스
	/*
	 * 
	 */
	int i = 100;
	//기본형을 참조형으로 변환
	Integer iObj = new Integer(i);
	//참조형을 기본값으로
	int val = iObj.intValue();
	MyArrayList list = new MyArrayList();
	int i2 = iObj;// Objcet obj = i2; //Object obj = new Integer(i2); //자동 언박싱 발생
	list.add(new Integer(val));
	list.add(i2);//자동 박싱 발생
	//boxing ,unboxing = 1.5ver부터 적용.
	//
	Object obj =1030;
	System.out.println(obj instanceof Integer);//오브제라는 객체가 인테저의 인스턴스이냐
	System.out.println(obj);
}
}
