public class Container {
	
	private ContainerElement start;
	private int maxWeight = 0;
	private int size = 0;

	//Konstruktor
	public Container(int maxWeigth) {
		setMaxWeight(maxWeight);
	}
	
	//GETTER SETTER
	public int getMaxWeight() {
		return maxWeight;
	}
	public int getSize() {
		return size;
	}
	private void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
	//METHODEN
	public int getWeight() {
		ContainerElement current = start;
		if(current == null) {
			return 0;
		}
		int tmpweight = 0;
		for(int i = 0; i < this.getSize(); i++) {
			tmpweight += current.getValue().getWeight();
			current = current.getNext();
			}
		return tmpweight;
	}
	
	public void clear() {
		start.setValue(null);
		start.setNext(null);
	}
	
	public boolean add(Package value) {
		int freespace;
		freespace = (this.getMaxWeight() - this.getWeight());
		if(freespace >= value.getWeight()) {
			//add package
			ContainerElement elem = new ContainerElement();
			elem.setValue(value);
			if (start == null) { // list is empty
				start = elem;
			}
			else {
				ContainerElement current = start;
				while (current.getNext() != null) { // find last element
					current = current.getNext();
				}
				current.setNext(elem);
			}
			size++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void addOpt(Package[] values) {
		  for (Package value : values) {
		    if (getWeight() + value.getWeight() <= maxWeight) {
		      add(value);
		    }
		  }
		}
}
