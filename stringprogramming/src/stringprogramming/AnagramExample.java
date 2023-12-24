package stringprogramming;

import java.util.Arrays;

public class AnagramExample {
	public static void main(String[] args) {
		String s = "C arE";
		String s1 = "R ace";
		if (s.contains(" ") || s1.contains(" ")) {
			s = s.replace(" ", "");
			s1 = s1.replace(" ", "");
		}
		s = s.toLowerCase();
		s1 = s1.toLowerCase();

		char[] ch1 = s.toCharArray();
		char[] ch2 = s1.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if (Arrays.equals(ch1, ch2)) {
			System.out.println("its Anagram");
		} else {
			System.out.println("Its not anagram");
		}
	}
}
