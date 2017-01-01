package day08;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthScrollBarUI;
import javax.xml.transform.stax.StAXSource;

//정규표현식 알아보기. 어렵댄다
public class Test03 {
	public static Object ad(){
		Object d="1";
		
		
		
		String result = String.valueOf(ad());
		System.out.println(result);
		
		/*
		 * 
		 * 
		 * 약 17개
		
//	static String	valueOf(boolean b)
//	다양한 타입을 받아 문자열로 변환
		
		Object add = new Object();
		
		
		return add;
	}
	public static void main(String[] args) {
		
		String s = "java is easy";
		String s1 = "Java Is Easy";
		
		
//		format(Locale l, String format, Object... args)
//		Returns a formatted string using the specified locale, format string, and arguments.
		/// 매개변수에 ...이 붙으면 0 이상의 아규먼트가 있을 수 있다. Object는 모든 클래스의 부모클래스
		
		System.out.printf("나이 : %d, 이름 : %s \n",33,"이진호");
		String result = String.format("나이 : %d, 이름 : %s \n",33,"이진호");//반환타입이 스트링이라 받을 수 있음. 스테틱
		
		s="   dsfdsfd  adsf asdfdsafadsf   dfads   ";
//		String	trim()
//		Returns a string whose value is this string, with any leading and trailing whitespace removed.
		//공백문자 제거
		System.out.println("|"+s.trim()+"|");
		System.out.println(s.replace(" ",""));//모든 공백문자 제거
		
		
//		String[]	split(String regex)
//		Splits this string around matches of the given regular expression.
//		앞으로 많이 쓸것. 구분자를 받아 그게 나올때마다 문자열배열단위로 나눔 regex=정규표현식 나타낼때 주로 쓰는 아규먼트 네임
		s="수지:33:분당:su@a.com";//이름 나이 주소 메일
		
		String[] sArr=s.split(":");
		System.out.println(Arrays.toString(sArr));
		
//		String	substring(int beginIndex)
//		Returns a string that is a substring of this string.
//		자를 위치를 받아 끝까지 삭제
//		String	substring(int beginIndex, int endIndex)
//		Returns a string that is a substring of this string.
//		시작 끝 위치를 받아 삭제
		s=s.substring(2);
		System.out.println(s);
		s = "java is easy";
		s=s.substring(2, 8);//endindex는 미포함. 배열초과 주의
		System.out.println(s);
		
		// String replace(char oldChar, char newChar)
		// Returns a string resulting from replacing all occurrences of oldChar
		// in this string with newChar.
		// 문자열 내 캐릭터단위 변환
		// String replace(CharSequence target, CharSequence replacement)
		// Replaces each substring of this string that matches the literal
		// target sequence with the specified literal replacement sequence.
		// 문자열 내 문자열단위 변환
		String result = s.replace("easy", "hard");// s 자체를 바꾸는게 아니라 결과값만 반환.
		// 바꾸려면 s에 직접 대입(밑줄 처럼 하면됨)
		s = s.replace("easy", "hard");
		s = "abc32ad3256das";
		for (int i = 0; i < 10; i++) {
			s=s.replace("" + i, "*");
		}
		
		System.out.println(s);
		s = "abc32ad3256das";
		for(char c= 'a'; c<='z';c++){
			s=s.replace(c,'*' );
			
		}
		System.out.println(s);
		s = "abc32ad3256das";
		s=s.replaceAll("[0-9]", "*");
		System.out.println(s);
		s = "abc32ad3256das";
		s=s.replaceAll("[a-z]", "*");
		System.out.println(s);
		 * 
		 * // String toUpperCase() // Converts all of the characters in this
		 * String to upper case using the rules of the default locale. //대문자로 //
		 * String toUpperCase(Locale locale) // Converts all of the characters
		 * in this String to upper case using the rules of the given Locale.
		 * //소문자로 // char[] toCharArray() // Converts this string to a new
		 * character array. //기준 문자열을 캐릭터 배열로
		 * System.out.println(s.toUpperCase());
		 * System.out.println(s.toLowerCase()); char[] arr = s.toCharArray();
		 * System.out.println(Arrays.toString(arr));
		 * 
		 * // boolean startsWith(String prefix) // Tests if this string starts
		 * with the specified prefix. //특정한 문자열로 시작하는지 묻고 값을 트루펄스로 반환 boolean
		 * bool = s.startsWith("java"); System.out.println(bool); // boolean
		 * endsWith(String suffix) // Tests if this string ends with the
		 * specified suffix. //특정한 문자열로 끝나는지 묻고 값을 트루펄스로 반환 bool =
		 * s.endsWith("easy"); System.out.println(bool);
		 * 
		 * // indexOf의 반대형태 // int lastIndexOf(int ch) // Returns the index
		 * within this string of the last occurrence of the specified character.
		 * // indexOf기능은 거의 모든 에디터에 ctrl+f형태로 붙어있음.
		 * 
		 * int index = s.lastIndexOf("a"); System.out.println(index); index =
		 * s.lastIndexOf("a",8);
		 * 
		 * 
		 * // 문자열의 인덱스 값을 추출 int index = s.indexOf("a");
		 * System.out.println(index); index = s.indexOf("a",index+1);//index+1을
		 * 넣어 찾은 값 다음부터 찾기 시작함 System.out.println(index); index =
		 * s.indexOf("ab"); System.out.println(index);//-1 반환됨. 내가 찾고자 하는 문자열이
		 * 더이상 없다는 뜻. 배열에서 음수가 나올 수 없으므로
		 * 
		 * // int indexOf(String str) // Returns the index within this string of
		 * the first occurrence of the specified substring. // int
		 * indexOf(String str, int fromIndex) // Returns the index within this
		 * string of the first occurrence of the specified substring, starting
		 * at the specified index.
		 * 
		 * // 문자열에 특정한 값이 포함되어 있는가
		 * 
		 * System.out.println(s.contains("is")); // boolean
		 * contains(CharSequence s) 자동형변환이 되는 형태면 이 타입이 아니어도 받을 수 있다 // Returns
		 * true if and only if this string contains the specified sequence of
		 * char values.
		 * 
		 * //문자형의 주소값이 아닌 문자열 내용 비교
		 * 
		 * System.out.println(s.equals(s1));
		 * System.out.println(s.equalsIgnoreCase(s1));
		 * 
		 * 
		 * // boolean equals(Object anObject)
		 * // Compares this string to the specified object.
		 * // 문자열 비교
		 * // boolean equalsIgnoreCase(StringanotherString)
		 * // Compares this String to another String, ignoring case considerations. // 대소문자 무시하고 비교
		 * 
		 * 
		 * //char charAt(int index); char c=s.charAt(0); System.out.println(c);
		 * 
		 * //i나오게 System.out.println(c=s.charAt(5));
		 * 
		 * //int length() int len=s.length(); System.out.println(s.length()+" "
		 * +len);
		 */

		return d;
	}
}
