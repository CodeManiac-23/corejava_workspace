package stringprogramming;

public class PangramLowerCaseExample {
	public static void main(String[] args) {
		String inputString = "The quick brown fox jumps over the lazy dog";
		boolean isPangram = isPangram(inputString);

		if (isPangram) {
			System.out.println("The string is a pangram.");
		} else {
			System.out.println("The string is not a pangram.");
		}
	}

	public static boolean isPangram(String str) {
		// Convert the string to lowercase
		str = str.toLowerCase();

		// Create a boolean array to mark the presence of each letter
		boolean[] alphabetMark = new boolean[26];

		// Iterate through each character in the string
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);

			// Check if the current character is a lowercase letter
			if (Character.isLetter(currentChar)) {
				// Mark the presence of the letter in the array
				alphabetMark[currentChar - 97] = true;
			}
		}

		// Check if all letters are present in the array
		for (boolean mark : alphabetMark) {
			if (!mark) {
				return false; // If any letter is missing, it's not a pangram
			}
		}

		return true; // All letters are present, it's a pangram
	}
}
