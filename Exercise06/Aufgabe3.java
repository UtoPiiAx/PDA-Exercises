
public class Aufgabe3 {

	public static void main(String[] args) {
		int [] test = {2, 4, 1, 3, 7};
		stepSum(test);
		stepSumRightAlign(test);
	}

	public static void stepSum (int[]array) {
		if(array.length==0) {
			return;
		}
		if(array.length == 1) {
			System.out.println(arrayToString(array));
		}
		int[] newArray = new int[array.length - 1];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = array[i] + array[i + 1];
		}
		stepSum(newArray);
		System.out.println(arrayToString(array));
	}
	
	
	public static void stepSumRightAlign(int[] array) {
		if(array.length == 0 ) {
			return;
		}
		
		if(array.length == 1) {
			System.out.println(arrayToString(array));
			return;
		}
		
		int[] newArray = new int[array.length-1];
		for(int i = 0; i < newArray.length; i++) {
			newArray[i] = array [i] + array[i+1];
		}
		
		String result = arrayToString(array);
		stepSumRightAlign(newArray);
		System.out.println(result);
	}
	
	
	private static String arrayToString(int[] array) {
		String result = "";
		for(int i = 0; i < array.length; i++) {
			result += array[i];
			if(i < array.length - 1) {
				result += ", ";
			}
		}
		return result;
	}
	
}