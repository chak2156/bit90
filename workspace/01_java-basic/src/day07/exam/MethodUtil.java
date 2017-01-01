package day07.exam;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import hansalgo.swap;

public class MethodUtil {

	Scanner sc = new Scanner(System.in);
	String sin = new String("");
	
	
	
	

	boolean isLowerChar(char a) {
		boolean a1 = false;
		int sd = a;

		return a1 = (122 >= sd && sd >= 97) ? true : false;
		// 97~122

	}

	boolean isUpperChar(char a) {
		boolean a2 = false;
		int sd = a;

		return a2 = (96 >= sd && sd >= 65) ? true : false;
	}

	int max(int i1, int i2) {
		if (i1 < i2)
			i1 = i2;
		return i1;
	}

	int min(int i1, int i2) {
		if (i1 > i2)
			i1 = i2;
		return i1;
	}

	String reverse(String r1) {
		char[] a1 = new char[r1.length()];
		for (int i = r1.length() - 1; i >= 0; i--) {

			a1[r1.length() - i - 1] = r1.charAt(i);

		}
		r1 = Arrays.toString(a1);

		return r1;
	}

	String toUpperString(String r2) {
		boolean bl = false;
		int sd = 0;

		/*
		 * boolean a1 = false; int sd=a;
		 * 
		 * return a1 = (122 >= sd && sd>= 97) ? true : false;
		 */
		char[] a1 = new char[r2.length()];
		for (int i = 0; i < r2.length(); i++) {

			a1[i] = r2.charAt(i);
			bl = (122 >= a1[i] && a1[i] >= 97) ? true : false;
			if (bl == true) {
				a1[i] = (char) ((int) a1[i] - 32);
			}

		}

		r2 = Arrays.toString(a1);
		return r2;
	}

	String toLowerString(String r3) {
		boolean bl = false;
		int sd = 0;
		char[] a1 = new char[r3.length()];
		for (int i = 0; i < r3.length(); i++) {
			a1[i] = r3.charAt(i);
			bl = (96 >= a1[i] && a1[i] >= 65) ? true : false;
			if (bl == true) {
				a1[i] = (char) ((int) a1[i] + 32);
			}
		}

		r3 = Arrays.toString(a1);
		return r3;
	}

}
