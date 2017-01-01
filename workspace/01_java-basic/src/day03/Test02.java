package day03;
//상수를 만드는 이유:파이처럼 사람마다 다르게 쓸 수 있는 경우를 하나로 통일하기 위해
//상수 묵시적 이름규칙:전부 대문자와 공백은 언더바로 표현
public class Test02 {
public static void main(String[] args) {
	/*
	int CLASS_PERSON_COUNT = 17;
	System.out.println(CLASS_PERSON_COUNT);
	
	CLASS_PERSON_COUNT = 18;
	System.out.println(CLASS_PERSON_COUNT);
	*/
	final int CLASS_PERSON_COUNT = 11;
	
	final int a=100;
	
	System.out.println(a+CLASS_PERSON_COUNT);
	
	//a=111;
	
	//문자열 상수 테스트
	System.out.println("c:\test 는 파일이 저장된 폴더입니다.");
	System.out.println("c:\\test 는 파일이 저장된 폴더입니다.");//역슬래시 쓰는법
	System.out.println("톨스토이는 이렇게 이야기 합니다.\"불라불라\"...");//큰따옴표 쓰는법
	//System.out.println("c:\java90"); 이게 오류 나는 이유는 역슬래시 이후에 등록된 상수값만 와야 함
	
	
}
}
