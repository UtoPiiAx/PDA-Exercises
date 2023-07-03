
public class TemperatureIO {

	public static void main(String[] args) {
		int tempC = IO.readInt("Temperatur in °C: ");
		double tempF = 9.0 / 5 * tempC + 32;
		System.out.println("Temperatur in °F: " + tempF);	}
}