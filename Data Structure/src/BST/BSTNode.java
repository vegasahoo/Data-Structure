package BST;


public class BSTNode {
    int data;
    BSTNode left, right;

    public BSTNode(int data){
        this.data = data;
        left = right = null;
    }

    public int getData() {
        return data;
    }

    public BSTNode getLeft() {
        return left;
    }

    public BSTNode getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }
    
    public static void inOrder(BSTNode root){
        if(root!= null){
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
