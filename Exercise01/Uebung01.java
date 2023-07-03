public class Uebung01 {
	public static void main (String[] args) {
		// Deklaration der Variablen
		int a = 7;
		int b = 6;
		
		// Startwert für Summe der Addition festlegen
		int start = a;
		
		// Startwert für Anzahl der Addition festlegen
		int anzahl = 0;
		while (start <= 30) {
			start = start + b;
			anzahl = anzahl + 1;
		}
		System.out.println("Die Anzahl der Addition ist: " + anzahl);
	}
}