public class BoyerMoore {
	
	private static char[][] TEXTS = new char[][] { "anna isst ananas".toCharArray(), "01110100111111001100".toCharArray() };
	private static char[][] PATTERNS = new char[][] { "nas".toCharArray(), "1111001".toCharArray() };

	public static void main(String[] args) {
		for (int i = 0; i < TEXTS.length; i++) {
			System.out.println(boyerMoore(TEXTS[i], PATTERNS[i]));
		}
	}

	public static int boyerMoore(char[] text, char[] pattern) {
		int n = text.length;
		int m = pattern.length;
		
		if (n < m) { // pattern is longer than text, no check necessary
			return -1;
		}
		
		int[] delta1 = createDelta1(pattern);
		
		int i = m - 1; // text index: start at the end of the pattern
		int j = m - 1; // pattern index: also start at the end of the pattern

		while (i < n) { // move i until reaching the end of the text
			while (text[i] == pattern[j]) { // check the pattern from back to front at the current position
				i--;
				j--;
				if (j < 0) { // entire pattern checked against text, match found!
					return i + 1;
				}
			}
			// mismatch between text and pattern at positions i and j
			if (m - j > delta1[text[i]]) { // case 1
				i += m - j;
				j = m - 1;
			} else {
				i += delta1[text[i]]; // case 2
				j = m - 1;
			}
		}
		return -1; // no match found in entire text
	}

	private static int[] createDelta1(char[] pattern) {
		// create result array for alphabet (char) 0 -- (char) 255
		int[] result = new int[256];
		int m = pattern.length;
		for (int i = 0; i < result.length; i++) { // initialise all positions with default value m
			result[i] = m;
		}
		/*
		 * for all characters in the pattern (from left to right, except for the last position), set result to m - (j + 1)
		 * only the right-most occurrence is relevant, by moving from left to right we overwrite previous occurrences
		 */
		for (int j = 0; j < pattern.length - 1; j++) {
			result[pattern[j]] = m - (j + 1);
		}
		return result;
	}
}
