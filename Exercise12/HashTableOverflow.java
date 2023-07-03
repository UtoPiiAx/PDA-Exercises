import java.util.LinkedList;

public class HashTableOverflow {
	private LinkedList<KeyValue>[] table;
	private int size = 7;

	public HashTableOverflow() {
		table = (LinkedList<KeyValue>[]) new LinkedList[size];
	}

	public boolean add(KeyValue data) {
		int key = data.getKey();
		int index = key % size;
		if (table[index] == null) {
			table[index] = new LinkedList<KeyValue>();
		}
		table[index].add(data);
		return true;
	}

	public KeyValue get(int key) {
		int index = key % size;
		if (table[index] == null) {
			return null;
		}
		for (KeyValue data : table[index]) {
			if (data.getKey() == key) {
				return data;
			}
		}
		return null;
	}
}
