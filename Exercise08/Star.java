
public class Star {
	private String name;
	private String id;
	private double distance;
	private double apparentMagnitudes;
	private String type;
	
	//Konstruktoren
	public Star () {	
	}
	public Star (String name, String id) {
		setName(name);
		setId(id);
	}
	
	// Methoden
	public boolean isCloserThan(Star other) {
		if (this.getDistance() < other.getDistance()) {
			return true;
		} else {
			return false;
		}
	}
	public double getDistanceInPC() {
		return this.getDistance() * 3.26;
	}
	public double getAbsoluteMagnitude() {
		double log = Math.log10(this.getDistanceInPC());
		double M = this.getAbsoluteMagnitude() - 5 * log + 5;
		return M;
	}
	public boolean checkType() {
		if(this.getAbsoluteMagnitude() <= 20 && this.getAbsoluteMagnitude() >= 15) {
			if(this.getType().equals("Brown dwarf")) {
				return true;
			} else {
				return false;
				}
			}
		
		if(this.getAbsoluteMagnitude() <= 15 && this.getAbsoluteMagnitude() >= 10) {
			if(this.getType().equals("Red dwarf") || this.getType().equals("White dwraf") ) {
				return true;
			}
			else {
				return false;
				}
			}
		
		if(this.getAbsoluteMagnitude() <= 10 && this.getAbsoluteMagnitude() >= 5) {
			if(this.getType().equals("Sub dwarf")) {
				return true;
			}
			else {
				return false;
				}
			}
		
		if(this.getAbsoluteMagnitude() <= 5 && this.getAbsoluteMagnitude() >= 0) {
			if(this.getType().equals("Main Sequence") || this.getType().equals("Subgiant") ) {
				return true;
			} else {
				return false;
				}
			}
		
		if(this.getAbsoluteMagnitude() <= 0 && this.getAbsoluteMagnitude() >= -5) {
			if(this.getType().equals("Giant") || this.getType().equals("Bright giant") ) {
				return true;
			} else {
				return false;
				}
			}
		
		if(this.getAbsoluteMagnitude() <= -5 && this.getAbsoluteMagnitude() >= -10) {
			if(this.getType().equals("Blue supergiant") || this.getType().equals("Yellow supergiant") || this.getType().equals("Red supergiant") || this.getType().equals("Hypergiant")) {
				return true;
			} else {
				return false;
				}
			}
		
		else {
			return false;
		}
	}
	
	// Getter und Setter
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	public double getApparentMagnitudes() {
		return apparentMagnitudes;
	}
	public void setApparentMagnitudes(double apparentMagnitudes) {
		this.apparentMagnitudes = apparentMagnitudes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
