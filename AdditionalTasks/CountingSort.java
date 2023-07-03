import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		
		int [] a = {0, 5, 2, 3, 4, 1};	
		CountingSort.countingsort(a);
	}

	public static void countingsort (int [] a) {
		if (a.length == 0 || a == null) {
			return;
		}
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max ) {
				max = a[i];
			}
		}
		int [] h = new int[max + 1];
		for(int i = 0; i < a.length; i++) {
			h[a[i]]++;
		}
		
		int index = 0;
		for  (int i = 0; i < h.length; i++){
			for (int j = 0; j < h[i]; j++){
				a[index++] = i;
			}
		}
		System.out.println(Arrays.toString(a));
		}
}