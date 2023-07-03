public class Zahlensystem {
	public static void main(String[] args) {
		int radix = IO.readInt("Basis des Zahlensystems (> 1): ");
		while (radix <= 1) {
			radix = IO.readInt("Basis des Zahlensystems (> 1): ");
		}
		int number = IO.readInt("Positive Dezimalzahl: ");
		while (number < 0) {
		number = IO.readInt("POSITIVE Dezimalzahl: ");
			}
		while (number > 0) {
		int remainder = number % radix;
		System.out.print(remainder);
		System.out.print(' ');
		number = number / radix;
			}
		System.out.println();
	}
}