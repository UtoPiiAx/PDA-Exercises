public class Car {
	private String name;
	private int seat;
	private int door;
	private double topSpeed;
	private TrunkVolume trunkVolume;
	private Engine engine;
	private Tire[] tires = new Tire [4];
	
	// Konstruktor mit allen Attributen
	public Car (String name, int seat, int door, double topSpeed, TrunkVolume trunkVolume, Engine engine, Tire [] tires) {
		this.name = name;
		this.seat = seat;
		this.door = door;
		this.topSpeed = topSpeed;
		this.trunkVolume = trunkVolume;
		this.engine = engine;
		this.tires = tires;
	}
	
	// Funktionen / Methoden
	public boolean isFasterThan (Car otherCar) {
		return this.topSpeed > otherCar.topSpeed;
	}
	public boolean replaceTire(int tireIndex, Tire newTire) {
		if (tireIndex < 0 || tireIndex >= tires.length) {
			return false;
		}
		this.tires[tireIndex] = newTire;
		return true;
	}
	
	
	// Getter und Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public double getTopSpeed() {
		return topSpeed;
	}
	public void setTopSpeed(double topspeed){
		this.topSpeed = topspeed;
	}
	public TrunkVolume getTrunkVolume() {
		return trunkVolume;
	}
	public void setTrunkVolume(TrunkVolume trunkVolume) {
		this.trunkVolume = trunkVolume;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Tire[] getTires() {
		return tires;
	}
	public void setTires(Tire[] tires) {
		this.tires = tires;
	}
}
