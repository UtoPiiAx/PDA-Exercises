public class Matrizenmultiplikation {

	public static void main(String[] args) {
		double [] [] a = new double [][] {
				{3, 1, 7},
				{3, 0, 3}
		};
		
		double [] [] b = new double [][] {
			{4, 2},
			{7, 1},
			{5, 2}
		};
		
		if(!isMatrix(a) || !isMatrix(b) || a[0].length != b.length) {
			System.out.println("Invalid Matrix!");
		} else {
			double [][] c = new double[a.length] [b[0].length];
			for (int i = 0; i < c.length; i++) {
				for (int j = 0; j < c[i].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						c[i][j] += a[i][k] * b[k][j];
						System.out.println(c[i][j]);
					}
				}
			}
		}
	}
	
	private static boolean isMatrix(double[][] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[0].length != a[i].length) {
				return false;
			}
		}
		return true;
	}
}
