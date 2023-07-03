
public class Tire {
	private String name;
	private boolean flat;
	private double profile;
	
	public Tire (String name, boolean flat, double profile) {
		this.name = name;
		this.flat = flat;
		this.profile = profile;
	}
	
	@Override
    public String toString() {
        return "" + name;
    }
	
	// Getter und Setter
	public String getName () {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public boolean isFlat() {
		return flat;
	}
	public void setFlat(boolean flat) {
		this.flat = flat;
	}
	public Double getProfile() {
		return profile;
	}
	public void setProfile(double profile) {
		this.profile = profile;
	}
}
