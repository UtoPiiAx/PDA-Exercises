public class Tutorium01 {
	public static void main(String[] args) {
		int value = IO.readInt("Bitte geben Sie eine positive dreistellige Zahl an: ");
		
		if (value >= 100 && value < 1000 ) {
			int zahl1 = value / 100;
			int zahl2  = value / 10 % 10;
			int zahl3 = value % 10;
			int sum1 = zahl1 + zahl2;
			int sum2 = zahl2 + zahl3;
			
			if (sum2 > 9) {
				sum1 += sum2 / 10;
				sum2 = sum2 % 10;
				
				if (sum1 > 9) {
					zahl1 += sum1 / 10;
					sum1 = sum1 % 10;
				}
			}
			int result = zahl1 * 1000 + sum1 * 100 + sum2 * 10 + zahl3;
			System.out.println(result);
			}
		else System.out.println("Eingabe nicht erfolgreich. Zahl muss dreistellig sein.");
	}
}