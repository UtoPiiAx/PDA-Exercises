
public class ArrayMerger {

	public static void main(String[] args) {
		int[] array1 = { 1, 3, 4, 5, 6, 9 };
		int[] array2 = { 2, 3, 5, 7, 8, 9, 10 };
		
		int length = array1.length + array2.length;
		
		int[] resultarray = new int[length];
		
		int newindex = 0;
		
		for(int k = 0; k < array1.length; k++) {
		resultarray[newindex] = array1[k];
		newindex++;
		}
		
		for(int j = 0; j < array2.length; j++) {
		resultarray[newindex] = array2[j];
		newindex++;
		}
		
		selectionsort(resultarray);
		
		for(int values: resultarray) {
		System.out.print(values + " ");
			}
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
}
