public class Aufgabe4 {

	public static void main(String[] args) {
		int number = 0;
		while (number <= 0) {
			number = IO.readInt("Zahl (> 0): ");
		}
		createNumber(number);
	}

	public static void createNumber (int number) {
		if (number == 4) {
			System.out.println(number);
		} else if  ( number % 10 == 0 || number % 10 == 4) {
			createNumber(number/10);
		} else {
			createNumber(number * 2);
		}
		
		System.out.println(number);
	}
}
