
public class Cube {
	private double edgeLength = 0;
	private double surfaceArea = 0;
	private double volume = 0;
	
	public Cube(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	public double getEdgeLength() {
		return edgeLength;
	}
	public double getSurfaceArea() {
		surfaceArea = 6 * edgeLength * edgeLength;
		return surfaceArea;
	}
	public double getVolume() {
		volume = edgeLength * edgeLength * edgeLength;
		return volume;
	}
	public void change(double increment) {
		edgeLength = edgeLength + increment;
	}
}
