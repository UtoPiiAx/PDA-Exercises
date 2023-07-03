public class CarTest {

	public static void main(String[] args) {
		TrunkVolume kofferraum1 = new TrunkVolume(2000);
		Engine motor1 = new Engine(1000);
		Tire reifen1 = new Tire("reifen1", false, 1.6);
		Tire reifen2 = new Tire("reifen2",false, 1.6);
		Tire reifen3 = new Tire("reifen3",false, 1.6);
		Tire reifen4 = new Tire("reifen4",false, 1.6);
		
		Tire reifen5 = new Tire("reifen5",false, 1.9);

		Tire [] array1 = {reifen1, reifen2, reifen3, reifen4};
		Car auto1 = new Car("Skoda", 4, 5 , 180, kofferraum1, motor1, array1);
		Car auto2 = new Car("Skoda2", 4, 5 , 200, kofferraum1, motor1, array1);

		System.out.println(auto1.getName() + "; Anzahl an Tueren: " + auto1.getDoor() + "; Anzahl an Sitzen: " + auto1.getSeat() + "; Hoechstgeschwindigkeit: " + auto1.getTopSpeed() + "; Reifenprofil: " + reifen1.getProfile() + "; Kofferraum Volumen: " + kofferraum1.getVolume());
		
		System.out.println(auto2.isFasterThan(auto1));
		
		auto1.replaceTire(3, reifen5);
		
		System.out.println("Die Reifen im Array lauten: " + array1[0].getName() + " " + array1[1].getName() + " " + array1[2].getName() + " " + array1[3].getName());
	}
}
