package module32;

import java.util.ArrayList;

class Node {
    int id;
    int left;
    int right;

    Node(int id, int left, int right) {
        this.id = id;
        this.left = left;
        this.right = right;
    }
}

public class LeafNodePrinter {
    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(new Node(0, 1, 2));
        nodes.add(new Node(1, -1, 3));
        nodes.add(new Node(2, -1, -1));
        nodes.add(new Node(3, 4, 5));
        nodes.add(new Node(4, -1, -1));
        nodes.add(new Node(5, -1, -1));

        System.out.println("Leaf nodes:");
        printLeafNodes(nodes, 0);
    }

    public static void printLeafNodes(ArrayList<Node> nodes, int nodeId) {
        Node currentNode = nodes.get(nodeId);
        if (currentNode.left == -1 && currentNode.right == -1) {
            System.out.println("Node " + currentNode.id);
        } else {
            if (currentNode.left != -1) {
                printLeafNodes(nodes, currentNode.left);
            }
            if (currentNode.right != -1) {
                printLeafNodes(nodes, currentNode.right);
            }
        }
    }
}





