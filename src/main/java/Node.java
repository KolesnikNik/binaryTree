public class Node {
    private Integer value;
    private Node left;
    private Node right;

    public Node(){
        this.value = null;
    }
    public Node(int value){
        this.value = value;
    }

    public void insertNode(int value){
        if (this.value == null) this.value = value;
        else if(this.value == value) return;
        else if(this.value > value && left == null) left =  new Node(value);
        else if(this.value < value && right == null) right =  new Node(value);
        else if(this.value < value /* && right != null */) right.insertNode(value);
        else if(this.value > value /* && left != null */) left.insertNode(value);
    }

    public void printNode(){
        if(value == null) return;
        System.out.print(value + ", ");
        if(left != null) left.printNode();
        if(right != null) right.printNode();
    }

    public void deleteNode(Integer value){
            if (this.value == null) return;
            if (this.value < value && right != null) right.deleteNode(value);
            else if (this.value > value && left != null) left.deleteNode(value);
        if (!this.value.equals(value)) {
            return;
        }
        if (left == null && right == null) this.value = null;
        else if (left != null && right == null) minValue(left);
        //else if (left == null && right != null) minValue(right);
        else /*if(left != null && right != null)*/{
            this.value = right.value;
            minValue(right);
        }
    }

    public void minValue(Node node){
        if(node.left != null) {
            this.value = node.left.value;
            minValue(node.left);
        }else if(/*Node.left == null && */node.right != null) {
            this.value = node.right.value;
            minValue(node.right);
        } else {
            node.value = null;
            return;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeftNode() {
        return left;
    }

    public void setLeftNode(Node leftNode) {
        this.left = leftNode;
    }

    public Node getRightNode() {
        return right;
    }

    public void setRightNode(Node rightNode) {
        this.right = rightNode;
    }

}
