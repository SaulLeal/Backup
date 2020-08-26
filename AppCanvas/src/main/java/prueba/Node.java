package prueba;

class Node {
    private Node leftChild, rightChild;
    static int leftHeight = 0;
    static int rightHeight = 0;

    public Node(Node leftChild, Node rightChild) {
        if (leftChild != null) {
            addLeftHight();
        }
        if (rightChild != null) {
            addRightHight();
        }
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    private void addRightHight() {
        rightHeight++;
    }

    private void addLeftHight() {
        leftHeight++;
    }

    public Node getLeftChild() {
        return this.leftChild;
    }

    public Node getRightChild() {
        return this.rightChild;
    }

    public int height() {
        return getHight();
    }

    private int getHight() {
        if (leftHeight > rightHeight) {}
        return ;
    }

    public static void main(String[] args) {
        Node leaf1 = new Node(null, null);
        Node leaf2 = new Node(null, null);
        Node node = new Node(leaf1, null);
        Node root = new Node(node, leaf2);

        System.out.println(root.height());
    }
}