
public class Sums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumRecursive(new int[] {});
	}
	
	public static int sumIterative(int[] values) {
		int result = 0;
		for (int value : values) {
			result += value;
		}
		return result;
	}
	
	public static int sumRecursive(int [] values) {
		return sumRecursiveAux(values, values.length - 1);
	}
	/*
	 * Nur fuer length >= 0
	 */
	public static int sumRecursiveAux(int [] values, int length) {
		if (length < 0) {
			return 0;
		}
		if (length == 0) {
			return values[0];
		}
		return values[length] + sumRecursiveAux(values, length - 1);
	}

}
 