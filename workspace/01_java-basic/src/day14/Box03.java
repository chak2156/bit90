package day14;
//제네릭
public class Box03<T> {//컴파일시 객체생성부에서 받은 타입명을 꺽쇠 안에 저장. 즉 타입명을 받는 순간 클래스의 타입형이 고정됨
	private T data;
	public Box03(){}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}


}
