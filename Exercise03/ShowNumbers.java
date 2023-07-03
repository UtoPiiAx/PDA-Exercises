
public class ShowNumbers {
	public static void main(String[] args) {
		int [] data = new int [] {1, 2, 3, 4, 2};
		int index = 0;
		for (int value : data) {
			System.out.print (value);
			if (index < data.length - 1) {
				System.out.print(", ");
			}
			index++;
		}
		System.out.println();
	}
}