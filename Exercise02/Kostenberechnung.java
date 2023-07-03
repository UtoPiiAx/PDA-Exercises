import java.util.Scanner;

public class Kostenberechnung {

	public static void main(String[] args) {
		 Scanner downloads = new Scanner(System.in);
		 System.out.println("Anzahl Downloads (>=0): ");
		 double price = 0.15;
		 double price2 = 0.20;
		 double value = 0.0;
		 int anzahl = downloads.nextInt();
		 if (anzahl <= 5) {
			 System.out.println("Kosten = " + value + " EURO");
		 }
		 else if (anzahl > 5 && anzahl <= 35) {
			 value = (anzahl - 5) * price2;
			 System.out.println("Kosten = " + value + " EURO");
		 }
		 else {
			 value = (anzahl - 35) * price + 6;
			 System.out.println("Kosten = " + value + " EURO");
			 }
		 downloads.close();
	}
}