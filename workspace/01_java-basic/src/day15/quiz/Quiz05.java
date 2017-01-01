package day15.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Quiz05 {
	public static void main(String[] args) {
		List<Data> list = new ArrayList<>();
		list.add(new Data(3));
		list.add(new Data(9));
		list.add(new Data(5));
		Collections.sort(list);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		List<Integer> numbers = new ArrayList<>();
		int[] inumbers = new int[45];
		for (int i = 0; i < inumbers.length; i++) {
			inumbers[i] = i + 1;
		}
		Random r = new Random();
		for (int i = 0; i < 2000; i++) {
			int index = r.nextInt(45);
			int temp = inumbers[0];
			inumbers[0] = inumbers[index];
			inumbers[index] = temp;
		}
		for (int i = 1; i < 7; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(inumbers[i - 1]);
		}
		for (int i = 1; i < 46; i++) {
			numbers.add(i);
		}
		Collections.shuffle(numbers);
		for (int i = 1; i < 7; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(numbers.get(i - 1));
		}
		System.out.println();

	}
}
