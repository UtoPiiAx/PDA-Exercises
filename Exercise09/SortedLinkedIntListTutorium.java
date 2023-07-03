
public class SortedLinkedIntListTutorium {
    
	private LinkedIntListElement start;
    private LinkedIntListElement current;
    
    // Fuegt einen neuen Wert an der Stelle value in der Liste ein
    public void add(int value) {
        LinkedIntListElement elem = new LinkedIntListElement();
        elem.setValue(value);
        if (start == null) {
            start = elem;
        } else if (start.getValue() > value) {
        	elem.setNext(start);
        	start = elem;
        } else {
        	LinkedIntListElement prev = start;
        	LinkedIntListElement curr = start.getNext();
        	while(curr != null && curr.getValue() < value) {
        		prev = curr;
        		curr = curr.getNext();
        	}
        	prev.setNext(elem);
        	elem.setNext(curr);
        }
    }
    
    // Setzt das Iterieren ueber die Liste zurueck auf den Anfang
    public void reset() {
        current = start;
    }
    
    // Gibt beim Iterieren den naechsten Wert der Liste zurueck
    public Integer getNext() {
    	Integer result = current.getValue();
    	current = current.getNext();
    	return result;
    }
    
    // Gibt beim Iterieren an, ob es noch einen weiteren Wert in der Liste gibt
    public boolean hasNext() {
        return current != null;
    }    
    
    // Gibt den gesamten Inhalt der Liste als Integer-Array zurueck
    public int[] toArray() {
    	int length = 0;
    	reset();
    	while (hasNext()) {
    		length++;
    		getNext();
    	}
    	int [] result = new int [length];
    	reset();
    	for (int i = 0; i < result.length; i++) {
    		result[i] = getNext();
    	}
    	return result;
    }
    
    // Gibt die Anzahl der Elemente in der Liste zurueck
    public int size() {
        int size = 0;
        LinkedIntListElement current = start;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }
}