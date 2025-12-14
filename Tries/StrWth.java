
public class StrWth {

    static class Node {

        Node[] children = new Node[26];
        boolean eow = false; // End of word marker

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    // Insert a word into the Trie
    public static void insert(String word) {
        int lvl = 0;
        int len = word.length();
        int idx = 0;
        Node curr = root;

        for (; lvl < len; lvl++) {
            idx = word.charAt(lvl) - 'a'; // Get index of character
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node(); // Create a new node if none exists
            }
            curr = curr.children[idx]; // Move to the next node
        }
        curr.eow = true; // Mark end of word
    }

    // Search if a word is in the Trie
    public static boolean search(String key) {
        int lvl = 0;
        int len = key.length();
        int idx = 0;
        Node curr = root;

        for (; lvl < len; lvl++) {
            idx = key.charAt(lvl) - 'a'; // Get index of character
            if (curr.children[idx] == null) {
                return false; // If a character is missing, return false
            }
            curr = curr.children[idx]; // Move to the next node
        }
        // Return true only if the word exists and its end is marked as eow
        return curr.eow == true;
    }

    // Check if any word in the Trie starts with a given prefix
    public static boolean startWith(String prefix) {
        Node curr = root;

        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a'; // Get index of character
            if (curr.children[idx] == null) {
                return false; // If a character is missing, return false
            }
            curr = curr.children[idx]; // Move to the next node
        }
        return true; // If all characters in the prefix are found, return true
    }

    public static void main(String[] args) {
        String arr[] = {"apple", "app", "mango", "man", "woman"};

        String prefix1 = "app";
        String prefix2 = "moon";

        // Insert all words into the Trie
        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        // Search for a word
        System.out.println(search(prefix2)); // Output should be false (as "moon" is not in the Trie)
        System.out.println(search(prefix1)); // Output should be true (as "app" is in the Trie)
    }
}
