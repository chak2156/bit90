package day14;

public class Test06 {
	public static void main(String[] args) {
		Box01 b = new Box01();
		b.setData("test");
		String data = b.getData();
		System.out.println("data: "+data);
		Box02 b2 = new Box02();
		b2.setData(2);
		int data2 = (int) b2.getData();//이거랑 인테저랑 차이점이 뭔가
		System.out.println("data: "+data2);
		
		Box03<String> b3 = new Box03<String>();
		Box03<Integer> b4 = new Box03<Integer>();
		//제네릭=형변환 하기 귀찮아서 만들어진것
		//노란줄로 raw타입 어쩌구 하면 제네릭으로 사용가능
//		Box04<String,String> box04 = new Box04<String,String>("apple","사과"); 1.7버전 이하
		Box04<String,String> box04 = new Box04<>("apple","사과");
		System.out.println(box04.getKey());
		System.out.println(box04.getValue());
		
	}
}
