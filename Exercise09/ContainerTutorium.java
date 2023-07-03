
public class ContainerTutorium {
	private ContainerElement start;
	private int maxWeight;
	private int currentWeight;

	//Konstruktor
	public ContainerTutorium(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	public int size () {
		int result = 0;
		ContainerElement tmp = start;
		while (tmp != null) {
			tmp = tmp.getNext();
			result++;
		}
		return result;
	}
	
	public int getWeight() {
		return currentWeight;
	}
	
	public void clear () {
		start = null;
		currentWeight = 0;
	}
	
	public boolean add (Package value) {
		if (currentWeight + value.getWeight() <= maxWeight) {
			start = new ContainerElement (start, value);
			currentWeight += value.getWeight();
			return true;
		}
		return false;
	}
	
	public void addOpt (Package[] values) {
		for (Package value : values) {
			add(value);
		}
	}
}

// Komplexitätsklasse 0 (n!)
// O (n^2) keine Reihenfolge betrachten
