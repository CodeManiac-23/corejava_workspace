package stringprogramming;

public class PanagramExample {
	public static void main(String[] args) {

		String s = "The quick brown fox jumps over a lazy dog";
		String lPangram = isPangram("L", s) ? "It's pangram" : "It's not pangram";
		String uPangram = isPangram("U", s) ? "It's pangram" : "It's not pangram";
		System.out.println("LowerCase Pangram Checker : " + lPangram);
		System.out.println("UpperCase Pangram Checker : " + uPangram);

	}

	static boolean isPangram(String caseMark, String input) {
		boolean[] alphabetMark = new boolean[26];
		if (caseMark.equals("L")) {
			input = input.toLowerCase();
		} else if (caseMark.equals("U")) {
			input = input.toUpperCase();
		}
		for (int i = 0; i < input.length(); i++) {
			if (caseMark.equals("L") && Character.isLetter(input.charAt(i))) {
				// Ascii value of 'a' = 97
				alphabetMark[input.charAt(i) - 'a'] = true;
			} else if (caseMark.equals("U") && Character.isLetter(input.charAt(i))) {
				// Ascii value of 'A' = 65
				alphabetMark[input.charAt(i) - 'A'] = true;
			}
		}
		for (boolean b : alphabetMark) {
			if (!b) {
				return false;
			}
		}
		return true;

	}
}
