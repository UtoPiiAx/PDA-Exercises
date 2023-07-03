public class TemperatureTable {

	public static void main(String[] args) {
		System.out.println("°C\t°F");
		System.out.println("-----------");
		int celsius = -20;
		while (celsius <= 30) {
			double fahrenheit = (9.0 / 5 * celsius) + 32;
			System.out.println(celsius + "\t" + fahrenheit);
			celsius = celsius + 1;
		}
	}
}	
