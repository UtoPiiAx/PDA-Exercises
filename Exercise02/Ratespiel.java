import java.util.Scanner;

public class Ratespiel {

	public static void main(String[] args) {
		int randomNumber = (int)(Math.random() * 101.0); // Zufallszahl zwischen 0 und 100 wird generiert.
		System.out.println("Rate eine Zahl zwischen 1 und 100: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int counter = 1;
		while (number != randomNumber) {
			if (number > randomNumber) {
				System.out.println("Zufallszahl ist kleiner!");
				}
			if (number < randomNumber) {
				System.out.println("Zufallszahl ist groesser!");
				}
			number = input.nextInt();
			counter++;
		}
		System.out.println("Geschafft! Zufallszahl war " + randomNumber);
		System.out.println("Anzahl an Versuchen = " + counter);
		input.close();
	}
}