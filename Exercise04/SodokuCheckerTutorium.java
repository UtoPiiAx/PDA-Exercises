
public class SodokuCheckerTutorium {

	public static void main(String[] args) {
		int[][] sudoku = new int [][] {
			{ 0 , 9 , 0 , 0 , 0 , 0 , 1 , 1 , 0 } ,
			{ 8 , 0 , 4 , 0 , 2 , 0 , 3 , 0 , 7 } ,
			{ 0 , 6 , 0 , 9 , 0 , 7 , 0 , 2 , 0 } ,
			{ 0 , 0 , 5 , 0 , 3 , 0 , 1 , 0 , 0 } ,
			{ 0 , 7 , 0 , 5 , 0 , 1 , 0 , 3 , 0 } ,
			{ 0 , 0 , 3 , 0 , 9 , 0 , 8 , 0 , 0 } ,
			{ 0 , 2 , 0 , 8 , 0 , 5 , 0 , 6 , 0 } ,
			{ 1 , 0 , 7 , 0 , 6 , 0 , 4 , 0 , 9 } ,
			{ 0 , 3 , 0 , 0 , 0 , 0 , 0 , 8 , 0 }
			};
			
		boolean [] check;
		
		for (int row = 0; row < 9; row++) {
			check = new boolean[9];
			for(int i = 0; i < 9; i++) {
				int number = sudoku[row][i];
				if (number > 0) {
					if (check[number-1]) {
						System.out.println("Duplicate number '" + number + "' in row " + row + ".");
					}
					else {
						check[number - 1] = true;
					}
				}
			}
		}
		
		for (int col = 0; col < 9; col++) {
			check = new boolean [9];
			for (int i = 0; i < 9; i++) {
				int number = sudoku[i][col];
				if (number > 0) {
					if (check [number - 1]) {
						System.out.println("Duplicate number '" + number + "' in column " + col + ".");
					}
					else {
						check[number - 1] = true;
					}
				}
			}
		}
		
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 3; col++) {
				check = new boolean [9];
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					int number = sudoku[row * 3 + i] [col * 3 + j];
					if (number > 0) {
						if (check[number - 1]) {
							System.out.println("Duplicate number '" + number + "' in square " + (row * 3 + col) + ".");
						}
						else {
							check[number - 1] = true;
						}
					}
				}
			}
		}
	}
		
}

}
