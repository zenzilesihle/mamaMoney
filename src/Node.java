public class Node {
    int id;
    int parentID;
    String label;
    Node left;
    Node right;

    public Node() {
    }

    public Node(int id) {
        this.id = id;
        left = null;
        right = null;
    }


    public Node(int id, String label, int parentID) {
        this.id = id;
        this.parentID = parentID;
        this.label = label;
    }
}
