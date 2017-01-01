package day08;

public class Test01 {
public static void main(String[] args) {
	String s = new String("ja");//특별한 데이터 형태를 가지고 문자열을 만들고 싶을때 사용
	String s2 = "jara";
	
	byte[] bArr = {97,98,99};
	String s3= new String(bArr);// new는 무조건 heap 에 새로운 인스턴스를 만듬
	
	
	char[] sad = {'h','e','l','l'};
	String sadStr = new String(sad);
	System.out.println(sad);
	
System.out.println(s);
System.out.println(s2);
System.out.println(s3);
System.out.println(s == s2);//false

String s4="a";
String s5="a";
System.out.println(s4==s5);//true
//s4=s4+"b";//ab
s4="b";//s4에 b에 해당하는 주소를 다시 할당
System.out.println(s4==s5);//false
System.out.println(s4+"aa");
}
}
