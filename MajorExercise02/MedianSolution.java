import java.util.Arrays;

public class MedianSolution {

	public static void main(String[] args) {
		double[] test1a = new double[] {};
		double[] test1b = new double[] { 1 };
		double[] test1c = new double[] { 1, 3, 5, 6, 8 };
		double[] test1d = new double[] { 1, 3, 5, 6, 8, 9};
		double[][] test2a = new double[][] {};
		double[][] test2b = new double[][] { { 1 } };
		double[][] test2c = new double[][] { { 1, 2, 3 }, { 4, 5 } };
		double[][] test2d = new double[][] { { 1, 2, 3 }, { }, { 4, 5, 6 }, { 7 } };
		
		System.out.println(median(test1a)); // 0.0
		System.out.println(median(test1b)); // 1.0
		System.out.println(median(test1c)); // 5.0
		System.out.println(median(test1d)); // 5.5
		
		System.out.println("--------");
		
		System.out.println(medianOfMedians(test2a)); // 0.0
		System.out.println(medianOfMedians(test2b)); // 1.0
		System.out.println(medianOfMedians(test2c)); // 3.25
		System.out.println(medianOfMedians(test2d)); // 3.5

		System.out.println("--------");
		
		System.out.println(median2Dim(test2a)); // 0.0
		System.out.println(median2Dim(test2b)); // 1.0
		System.out.println(median2Dim(test2c)); // 3.0
		System.out.println(median2Dim(test2d)); // 4.0
	}
	
	public static double median(double[] values) {
		if (values.length == 0) {
			return 0;
		}
		int center = values.length / 2;
		if (values.length % 2 == 0) {
			return (values[center - 1] + values[center]) / 2;
		} else {
			return values[center]; 
		}
	}
	
	public static double medianOfMedians(double[][] values) {
		double[] medians = new double[values.length];
		for (int i = 0; i < values.length; i++) {
			medians[i] = median(values[i]);
		}
		Arrays.sort(medians);
		return median(medians);
	}

	public static double median2Dim(double[][] values) {
		int length = 0;
		for (double[] values2 : values) {
			length += values2.length;
		}
		if (length == 0) {
			return 0;
		}
		int center = length / 2;
		if (length % 2 == 0) {
			return (getValueAt(values, center - 1) + getValueAt(values, center)) / 2;
		} else {
			return getValueAt(values, center);
		}
	}

	private static double getValueAt(double[][] values, int pos) {
		int index = 0;
		for (double[] values2 : values) {
			for (int index2 = 0; index2 < values2.length; index2++) {
				if (index == pos) {
					return values2[index2];
				}
				index++;
			}
		}
		return 0;
	}
}
