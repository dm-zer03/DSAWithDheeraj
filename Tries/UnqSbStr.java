
public class UnqSbStr {

    static class Node {

        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        int lvl = 0;
        int len = word.length();
        int idx = 0;
        Node curr = root;

        for (; lvl < len; lvl++) {
            idx = word.charAt(lvl) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) {
        int lvl = 0;
        int len = key.length();
        int idx = 0;
        Node curr = root;

        for (; lvl < len; lvl++) {
            idx = key.charAt(lvl) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow = true;
    }

    public static int countNode(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += countNode(root.children[i]);
        }

        return count + 1;
    }

    public static void main(String[] args) {
        String str = "apple"; //Ans = 10

        //Suffix -> insert in trie
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
            insert(suffix);
            // System.out.println(suffix);
        }

        System.out.println("Count:" + countNode(root));
    }
}
