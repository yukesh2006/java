package day11;
class Trie {
    static class Node {
        Node[] child = new Node[26];
        boolean end;
    }
    Node root = new Node();
    void insert(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.child[index] == null) {
                current.child[index] = new Node();
            }
            current = current.child[index];
        }
        current.end = true;
    }
    boolean search(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.child[index] == null) {
                return false;
            }
            current = current.child[index];
        }
        return current.end;
    }
    public static void main(String[] args) {
        Trie t = new Trie();
        t.insert("cat");
        t.insert("car");
        t.insert("cab	");
        System.out.println(t.search("cat"));
        System.out.println(t.search("cap"));
    }
}