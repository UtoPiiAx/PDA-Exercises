public class HashTableOpen {
	private KeyValue[] table;
	private int size = 7;

	public HashTableOpen() {
		table = new KeyValue[size];
	}

	public boolean add(KeyValue data) {
		int key = data.getKey();
		int index = key % size;
		int i = 0;
		while (table[index] != null) {
			i++;
			index = (key + (i * i)) % size;
		}
		table[index] = data;
		return true;
	}

	public KeyValue get(int key) {
		int index = key % size;
		int i = 0;
		while (table[index] != null) {
			if (table[index].getKey() == key) {
				return table[index];
			}
			i++;
			index = (key + (i * i)) % size;
		}
		return null;
	}
}
