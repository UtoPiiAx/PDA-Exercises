public class Aufgabe1 {

	public static void main(String[] args) {
		
	}
	
	public static int arraysum1D(int[] numbers) {
		int result = 0;
		for (int i = 0; i < numbers.length; i++ )
			{
				result += numbers[i];
			}
			return result;
		}
	
		public static int arraysum2D(int[][] numbers) {
		int result = 0;
		for(int index = numbers.length - 1; index >= 0; index--) {
			result = result + arraysum1D(numbers[index]);
			}
			return result;
		}
		
		public static int arraysum3D(int[][][] numbers) {
		int result = 0;
		for(int index = numbers.length - 1; index >= 0; index--) {
			result = result + arraysum2D(numbers[index]);
			}
			return result;
		}
		
		public static double average3D(int[][][] numbers) {
			if(numbers.length != 0) {
				double result = 0;
				double n = 0;
				for(int i = 0; i < numbers.length; i++) {
					for(int j = 0; j < numbers[i].length; j++) {
						for(int k = 0; k < numbers[i][j].length;k++) {
							n = n + 1;
						}
					}
				}
			result = arraysum3D(numbers) / n;
			return result;
			}
			else {
				return 0;
			}
	}
}
