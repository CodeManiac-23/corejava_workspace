package stringprogramming;

public class StringPalindromeExample {
	public static void main(String[] args) {
		String s = "malayalam";
		String s2 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s2 = s2 + s.charAt(i);
		}
		if (s.equals(s2)) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
