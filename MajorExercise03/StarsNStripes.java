public class StarsNStripes {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(stars(i));
		}
	}

	private static String stars(int count) {
		if (count < 1) {
			return "";
		} else if (count > 1) {
			return "*" + stripes(count - 1) + "*";
		} else {
			return "**";
		}
	}

	private static String stripes(int count) {
		if (count < 1) {
			return "Broken";
		} else if (count >= 2) {
			return "/" + stars(count - 1) + "/";
		} else {
			return "//";
		}
	}

}
