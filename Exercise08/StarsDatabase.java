
public class StarsDatabase {
	private String name;
	private Star[] stars;
	private Star[] magnitudeRange;

	//Konstruktoren
	public StarsDatabase() {
	}
	public StarsDatabase(String name) {
		this.name = name;
		stars = new Star[0];
	}
	
	public Star[] getMagnitudeRange(double low, double high) {
		for(int i = 0; i < stars.length; i++) {
			double mr = stars[i].getApparentMagnitudes();
			if ( low <= mr && mr <= high) {
				magnitudeRange[i] = this.getStars(i);
				}
		}
		return magnitudeRange;
	}
	
	// Stern ID finden
	public Star find(String id) {
		Star result = null;
		for (int i = 0; i < stars.length; i++) {
			String id1 = stars[i].getId();
			if (id.equals(id1)) {
				result = this.getStars(i);
			}
		}
		return result;
	}
	
	// Stern hinzufügen 
	public void add(Star star) {
		Star [] tmparray = new Star [stars.length + 1];
		for (int i = 0; i < stars.length; i++) {
			tmparray[i] = stars[i];
		}
		tmparray[stars.length] = star;
		stars = tmparray;
		System.out.println(stars.length);
	}
	
	// Stern entfernen
	public void remove(int index) {
		Star [] tmparray = new Star [stars.length - 1];
		for (int i = 0; i < stars.length; i++) {
			tmparray[i] = stars[i];
		}
		for (int k = 0; k < stars.length; k++) {
			tmparray[k - 1] = stars[k];
		}
		stars = tmparray;
		System.out.println(stars.length);
	}
	
	// Größe der Datenbank
	public int size() {
		return stars.length;
	}
		
	// Abfragen der Sterne
	public Star getStars(int index) {
		return stars[index];
	}
	
	// Getter
	public String getName () {
		return name;
	}
}
