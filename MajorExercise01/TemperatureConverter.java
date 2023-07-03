import java.util.Scanner; // Scanner-Klasse einbinden

public class TemperatureConverter {
	public static void main (String [] args) {
		 double celsius;
		 double fahrenheit;
		 // Scanner-Objekt fuer die Standard-Eingabe erzeugen
		 Scanner eingabewert = new Scanner(System.in);
		 
		 System.out.println("Wie viel Grad Celsius soll in Fahrenheit umgerechnet werden?");
		 // celsius Eingabe wird eingelesen
		 celsius = eingabewert.nextInt();		
		 
		 fahrenheit = (1.8 * celsius) + 32;
		 
		 System.out.println(celsius + " Grad Celsius entspricht genau " + fahrenheit + " Grad Fahrenheit.");
		 
		 eingabewert.close();
	  }
}
