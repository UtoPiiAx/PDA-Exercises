public class TrieNode {

    private char letter;
    private int value;
    private TrieNode[] children;
    private static final int ALPHABET_SIZE = 26; // assuming we're using only lowercase english alphabet
	
    public TrieNode() {
        children = new TrieNode[ALPHABET_SIZE];
        value = -1;
    }
    
    public TrieNode(char letter) {
        this();
        this.letter = letter;
    }
    
    public int getValue() {
        return value;
	}

    public void setValue(int value) {
        this.value = value;
	}

    /**
     * Adds a new child node with the given key and value to this node.
     * @param letter The character of this node
     * @param value The value associated with this node, or -1 if no value is associated
     * @return The new child if it could be added or if a node with the given key is already
     *         there, null if there are already three children
     */
    public TrieNode addChild(char letter, int value) {
    	int index = letter - 'a';
        if (children[index] == null) {
            children[index] = new TrieNode(letter);
            children[index].setValue(value);
            return children[index];
        }
        return null;
	}

    /**
     * Searches this node's direct children for a node with the given key.
     * @param letter The character to look for
     * @return Returns the TrieNode with the given key if it was found, or null otherwise
     */
    public TrieNode find(char letter) {
    	int index = letter - 'a';
        if (children[index] != null) {
            return children[index];
        }
        return null;
	}

}