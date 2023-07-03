public class SortedLinkedIntList {
    private LinkedIntListElement first;
    private LinkedIntListElement currentElement;
    
    // Fuegt einen neuen Wert an der Stelle value in der Liste ein
    public void add(int value) {
        LinkedIntListElement element = new LinkedIntListElement();
        element.setValue(value);
        if (first == null) {
            first = element;
        } else {
            LinkedIntListElement current = first;
            while (current.getNext() != null && current.getNext().getValue() < value) {
                current = current.getNext();
            }
            element.setNext(current.getNext());
            current.setNext(element);
        }
    }
    
    // Setzt das Iterieren ueber die Liste zurück auf den Anfang
    public void reset() {
        currentElement = first;
    }
    
    // Gibt beim Iterieren den nächsten Wert der Liste zurueck
    public Integer getNext() {
    	if (hasNext()) {
            Integer value = currentElement.getValue();
            currentElement = currentElement.getNext();
            return value;
        } else {
        return null;
        }
    }
    
    // Gibt beim Iterieren an, ob es noch einen weiteren Wert in der Liste gibt
    public boolean hasNext() {
        return currentElement != null;
    }    
    
    // Gibt den gesamten Inhalt der Liste als Integer-Array zurueck
    public int[] toArray() {
    	int size = size();
        int[] array = new int[size];
        LinkedIntListElement current = first;
        for (int i = 0; i < size; i++) {
            array[i] = current.getValue();
            current = current.getNext();
        }
        return array;
    }
    
    // Gibt die Anzahl der Elemente in der Liste zurueck
    public int size() {
        int size = 0;
        LinkedIntListElement currentElement = first;
        while (currentElement != null) {
            size++;
            currentElement = currentElement.getNext();
        }
        return size;
    }
}