public class StarsNStripes2 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			stars(i);
			System.out.println();
		}
	}

	private static void stars(int count) {
		if (count <= 0) {
			return;
		}
		System.out.print("*");
		stripes(count - 1);
		System.out.print("*");
	}

	private static void stripes(int count) {
		if (count <= 0) {
			return;
		}
		System.out.print("/");
		stars(count - 1);
		System.out.print("/");
	}

}
