
public class Methoden {

	public static void main(String[] args) {
		
	}
	
	//Aufgabe 2a)
		public static int min(int[] values) {
		selectionsort(values);
		return values[0];
		}
		public static int[] selectionsort(int[] resultarray) {
			for (int i = 0; i < resultarray.length; i++) {
				int minIndex = i;
				for(int j = i + 1; j < resultarray.length; j++) {
					if (resultarray[j] < resultarray[minIndex]) {
						minIndex = j;
					}
				}
				swap(resultarray, i, minIndex);
			}
			return resultarray;
		}
		private static void swap(int[] array1, int index1, int index2) {
			int tmp = array1[index1];
			array1[index1] = array1[index2];
			array1[index2] = tmp;
			}
		
	//Aufgabe 2b)
		public static double product(double[] values) {
			double product = 1;
			for(double numbers: values) {
				product = numbers * product;
			}
			return product;
		}
	
	//Aufgabe 2c)
		public static boolean isLatinLetter(char letter){
			int l = letter;
			if( l >= 65 && l <= 90) {
				return true;
			}
			if( l >= 97 && l <= 122) {
				return true;
			}
			else {
				return false;
			}
		}
		//andere Lösung aus Tutorium
		public static boolean isLatinLetter2(char letter){
			return (letter >= 65 && letter <= 90) || (letter >= 97 && letter <= 122);
		}
	
	//Aufgabe 2d)
		public static int[][] createIdentityMatrix(int size){
			int length = size;
			int[][] ematrix = new int[length][length];
			for( int i = 0; i < ematrix.length; ++i) {
				for( int j = 0; j < ematrix.length; ++j) {
					if( i == j) {
						ematrix[i][j] = 1;
					} else {
						ematrix[i][j] = 0;
					}
				}
			}
			return ematrix;
		}
		// andere Lösung aus Tutorium
		public static int[][] createIdentityMatrix2(int size){
			if (size < 1) return null;
			int [][] result = new int [size] [size];
			for (int i = 0; i < result.length; i++) {
				result[i][i] = 1;
			}
			return result;
		}
}
