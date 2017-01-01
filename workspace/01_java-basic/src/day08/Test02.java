package day08;
//문자열 다루기 클래스
//실무에서 앵간하면 스트링버퍼 써야 하는 이유
public class Test02 {
	public static void main(String[] args) {
		
		System.out.println("시간측정 시작");
		String s1="a";
		//문자열 변경시마다 새로운 문자의 주소를 할당받음
		StringBuffer s2 = new StringBuffer("a");//new StringBuffer("a")이 부분을 생성자라 한다
		//자기 자신의 문자열 변경가능
		//공간 할당 후 사용하다 다 쓰면 확장해서 다시씀
		StringBuilder s3 = new StringBuilder("a");
		//스트링버퍼와 비슷한 기능 1.5v부터 기능
		//버퍼와 빌더의 차이: 버퍼=동기화. 동시에 작업 불가,빌더=비동기화. 동시에 작업 가능
		
		long s = System.currentTimeMillis(); //1000분의 1초 기준:1970년1월1일0시0분0초
		for(int i=0 ;i<100000;i++){
			s1+=i;
		}
		long e = System.currentTimeMillis(); //1000분의 1초
		double time = (e - s)/1000.0;
		System.out.println("String:"+time);
		
		s = System.currentTimeMillis(); //1000분의 1초 기준:1970년1월1일0시0분0초
		for(int i=0 ;i<100000;i++){
			s2.append(i);//스트링버퍼에 문자열 추가하는 메소드
		}
		e = System.currentTimeMillis(); //1000분의 1초
		time = (e - s)/1000.0;
		System.out.println("StringBuffer:"+time);
		
	}

}
