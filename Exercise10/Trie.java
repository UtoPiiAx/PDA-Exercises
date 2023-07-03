public class Trie {

    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }

    /**
     * Adds a new value with the given key to the trie, creating new TrieNodes as required.
     * @param key The character sequence associated with the new value
     * @param value The new value
     * @return True if the value could be added to the trie, false otherwise
     */
    public boolean addValue(char[] key, int value) {
    	TrieNode current = root;
        for (char letter : key) {
            TrieNode child = current.find(letter);
            if (child == null) {
                child = current.addChild(letter, -1);
                if (child == null) {
                    return false;
                }
            }
            current = child;
        }
        current.setValue(value);
        return true;
	}

    /**
     * Returns the value associated with a given key, or -1 if the key could not be found.
     * @param key The given key
     * @return The associated value, or -1 if the key is not represented in this trie
     */
    public int findValue(char[] key) {
    	TrieNode current = root;
        for (char letter : key) {
            TrieNode child = current.find(letter);
            if (child == null) {
                return -1;
            }
            current = child;
        }
        return current.getValue();
    }
}