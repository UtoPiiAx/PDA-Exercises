
public class Sphere {
	private double radius;
	private double surfaceArea;
	private double volume;
	
	public Sphere (double radius) {
		this.radius = radius;
	}
	public double getSurfaceArea() {
		surfaceArea = 4 * Math.PI * Math.pow(this.radius, 2);
		return surfaceArea;
	}
	public double getVolume() {
		volume = (4 * Math.PI * Math.pow(this.radius, 3)) / 3;
		return volume;
	}
	public void change(double increment) {
		this.radius = this.radius + increment;
	}
}
