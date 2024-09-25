public class Node {

    Node parent;
    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }

    public boolean hasOnlyLeftChild() {
        return left != null && right == null;
    }

    public boolean hasOnlyRightChild() {
        return left == null && right != null;
    }

}
