
public class SudokuChecker {

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
			
			//Prüfung jede Ziffer pro Zeile
			//Durlauf Zeile 0-8
			for (int i = 0; i <= 8; i++) {
			//Durchlauf Index 0-8
				for (int j = 0; j <= 8; j++) {
					//Vergleich index j mit index k 0-8
					for (int k=0; k <= 8; k++) {
						// Spalte ungelich Null
						if (sudoku[i][j] != 0) {
							// Gleiche Zahl
							if(sudoku[i][j] == sudoku[i][k]) {
								if( j != k) {
								System.out.println("Dublicate number '" + sudoku[i][j] + "' in row " + i);
								}
							}
						}
					}
				}
			}
			//Prüfung jede Ziffer pro Spalte
			//Durlauf index 0-8
			for (int l = 0; l <= 8; l++) {
				//Durchlauf Reihe 0-8
				for (int m = 0; m <= 8; m++) {
					//Vergleich index m mit index n 0-8
					for (int n=0; n <= 8; n++) {
						// Wert ungelich Null
						if (sudoku[m][l] != 0) {
							// Gleiche Zahl
							if(sudoku[m][l] == sudoku[n][l]) {
								if (m != n) {
									System.out.println("Dublicate number '" + sudoku[m][l] + "' in column " + l + ".");
								}
							}
						}
					}
				}
			}
			int square = 20;
			//index 0-2
			for( int o = 0; o <= 8; o++) {
			//Zeile 0-2
				for( int p = 0; p <= 8; p++){
					//Vergleich mit index 0-2
					for(int q = 0; q <= 8; q++ ) {
						//Prüfung ob Wert belegt
						if (sudoku[p][o] != 0 ) {
							//Prüfen auf Gleichheit
							if(sudoku[p][o] == sudoku[p][q]) {
								if(o != q) {
									//Prüfung welches square
									if (o < 3 && p < 3) {
										square = 0;
									}
									else if (o < 6 && p < 3) {
										square = 1;
									}
									else if (o < 9 && p < 3) {
										square = 2;
									}
									else if (o < 3 && p < 6) {
										square = 3;
									}
									else if (o < 6 && p < 6) {
										square = 4;
									}
									else if (o < 9 && p < 6) {
										square = 5;
									}
									else if (o < 3 && p < 9) {
										square = 6;
									}
									else if (o < 6 && p < 9) {
										square = 7;
									}
									else if (o < 9 && p < 9) {
										square = 8;
									}
									System.out.println("Dublicate number '" + sudoku[p][o] + "' in square " + square + ".");
								}
							}
						}
					}
				}
			}		
	}
}