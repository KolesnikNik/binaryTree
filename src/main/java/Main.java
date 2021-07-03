public class Main {
    public static void main(String[] args) {
    Node binaryTree = new Node(20);
        binaryTree.insertNode(40);
        binaryTree.insertNode(39);
        binaryTree.insertNode(45);
        binaryTree.insertNode(30);
        binaryTree.insertNode(45);
        binaryTree.insertNode(4);
        binaryTree.insertNode(3);
        binaryTree.insertNode(8);
        binaryTree.insertNode(5);
        binaryTree.insertNode(6);
        binaryTree.insertNode(10);
        binaryTree.insertNode(11);
        binaryTree.insertNode(9);
        binaryTree.insertNode(31);

        System.out.println(" ");
        binaryTree.printNode();
        System.out.println(" ");
        binaryTree.deleteNode(8);
        System.out.println(" ");
        binaryTree.printNode();
        System.out.println(" ");
        Node binaryTree2 = new Node();
        System.out.println(" ");
        binaryTree2.insertNode(30);
        binaryTree2.printNode();
    }
}