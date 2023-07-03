import java.util.Arrays;

public class Methods {

	public static void main(String[] args) {
		int [] data = new int [] { 2, 6, 5 };
		int result = sum(data);
		System.out.println(result);

		int[] test1a = new int[] { 1, 2, 3 };
		int[] test1b = new int [] { 4, 5, 6 };
		int[] test1c = combine(test1a, test1b);
		System.out.println(Arrays.toString(test1c));
		
		int[] test2a = new int[] { };
		int[] test2b = new int [] { 4, 5, 6 };
		int[] test2c = combine(test2a, test2b);
		System.out.println(Arrays.toString(test2c));
		System.out.println(Integer.MAX_VALUE);
		if (combine(new int [Integer.MAX_VALUE / 20], new int [Integer.MAX_VALUE / 20]) == null) {
			System.out.println("Array too long!");
			}
		}
	
	private static int [] combine (int[] array1, int [] array2) {
		if (((long)array1.length + (long)array2.length) > (long)Integer.MAX_VALUE) {
			return null;
		}
		int[] result = new int [array1.length + array2.length];
		for (int i = 0; i < array1.length; i++) { 
			result [i] = array1[i];
		}
		for (int i = 0; i < array2.length; i++) { 
			result [i + array1.length] = array2[i];
		}
		return result;
	}
	
	private static int sum (int [] values) {
		int x = 0;
		for (int i : values) {
			x += i;
		}
		return x;
	}
}
