import java.util.ArrayList;
import java.util.Random;

public class TreeView {
    private ArrayList<Node> nodeList = load();

    Node root;

    public ArrayList<Node> load() {
        Node nodeB = new Node(123, "NodeB", 7000);
        Node nodeA = new Node(7000, "NodeA", 0);
        Node nodeC = new Node(9, "NodeC", 123);
        Node nodeF = new Node(3, "NodeF", 0);
        Node nodeE = new Node(25, "NodeE", 7000);
        Node nodeD = new Node(2, "NodeD", 7000);
        Node nodeG = new Node(10, "NodeG", 3);

        nodeList.add(nodeB);
        nodeList.add(nodeA);
        nodeList.add(nodeC);
        nodeList.add(nodeF);
        nodeList.add(nodeE);
        nodeList.add(nodeD);
        nodeList.add(nodeG);

        printTree(nodeList);
        insertNode(nodeList);
    }

    public void insertNode(ArrayList<Node> nodes) {
        for (Node node: nodes) {
            if(root == null) {
                root = node;
            }
            insertNode(root, node);
        }
    }

    private void insertNode(Node node, Node newNode) {
        if(node.id < newNode.id) {
            if(node.left == null)
                node.left = newNode;
            else {
                insertNode(root.left, newNode);
            }
        }
        else if(node.id > newNode.id) {
            if(node.right == null) {

                node.right = newNode;
            } else {
                insertNode(root.right, newNode);
            }
        }
    }

    int getNodeLevel(Node node, int data, int level) {

        return new Random(5l).nextInt();
    }

    public void printTree(ArrayList<Node> nodes) {


        for (int i = 0; i < nodes.size(); i++) {
            int level = getNodeLevel(nodes.get(i), nodes.get(i).id,3);
            print(level, nodes.get(i).label);
            System.out.println(nodes.get(i).label);
        }
//
//        for (int i = 0; i < nodes.size(); i++) {
//            print(i);
//            System.out.println(nodes.get(i).label);
//        }

//        for (Node element : nodeList) {
//            System.out.println(element.id);
//        }

    }

    public void print(int spaces, String label) {

//        System.out.println("lol");
        for (int i = 0; i < spaces; i++) {
            System.out.print("\t");
        }
//        System.out.println(label);
    }


}
/*
NodeB
NodeA
NodeC
NodeF
NodeE
NodeD
NodeG
*

NodeB
NodeA
NodeC
NodeF
NodeE
NodeD
NodeG


*
*
*
*
*
*
* */
