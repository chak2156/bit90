package day11.exam;

import java.text.Format;
import java.util.Arrays;

class MyArrayList {
	int stack = 0;
	Object[] str = new Object[0];

	@Override
	public String toString() {
		//MyArrayList[test,java] 를 출력함
		return String.format("MyArrayList[%s,%s]",str[0],str[1]);
	}

	public void add(String add) {
		if (stack == str.length) {
			Object[] temp = new Object[stack + 1];
			System.arraycopy(str, 0, temp, 0, stack);
			str = temp;
		}

		str[stack++] = add;
	}

	public Object get(int num) {

		return str[num];
	}

	public int size() {

		return stack;
	}

	public void remove(int i) {
		System.arraycopy(str, i+1, str, i, stack-(i+1));
		str[--stack]=null;
	}

	public void clear() {
		str=new Object[0];
		stack =0;
	}
}

public class Test01 {
	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		// list.get(0) 일 경우 "one"를 반환
		String data = (String) list.get(1);
		// data:two가 출력됨
		System.out.println("data:" + data);
		// add한 데이터들의 크기 반환
		int size = list.size();
		// 입력된 데이터의 크기 : 4가 출력됨
		System.out.println("입력된 데이터의 크기 : " + size);
		// two 데이터를 삭제 처리함
		list.remove(1);
		size = list.size();
		// 삭제후 데이터의 크기 : 3가 출력됨
		System.out.println("삭제후 데이터의 크기 : " + size);

		// 전체 데이터 삭제
		list.clear();
		size = list.size();
		// 전체 데이터 삭제 후 데이터의 크기 : 0 이 출력됨
		System.out.println("전체 삭제후 데이터의 크기 : " + size);
		list.add("test");
		list.add("java");

		// MyArrayList[test,java] 를 출력함
		System.out.println(list);
	}

}
