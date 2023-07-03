import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Bitte geben Sie ihr Gewicht ein (in kg): ");
		double weight = input.nextDouble();
		
		System.out.println("Bitte geben Sie ihre Groesse ein (in m): ");
		double height = input.nextDouble();
				
		System.out.println("Bitte geben Sie ihr Alter an (in Jahren)");
		double age = input.nextDouble();
		double bmi = weight / (height * height);
		
		if (age < 25 && bmi > 24 || age > 64 && bmi > 29 || age >= 25 && age <= 64 && bmi > 27) {
			System.out.println("Sie haben Uebergewicht!");
		}
		
		if (age < 25 && bmi < 19 || age > 64 && bmi < 24 || age >= 25 && age <= 64 && bmi < 22) {
			System.out.println("Sie haben Untergewicht!");
		}
		
		if (age < 25 && bmi >= 19 && bmi <= 24 || age > 64 && bmi >= 24 && bmi <= 29|| age >= 25 && age <= 64 && bmi >= 24 && bmi <= 27) {
			System.out.println("Sie haben Idealgewicht!");
		}
		input.close();
	}
}
