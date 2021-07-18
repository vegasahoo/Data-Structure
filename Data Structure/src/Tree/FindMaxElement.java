package Tree;

public class FindMaxElement {

    static int findMaxElement(BinaryTreeNode root){
        int maxVal = 0;
        if(root!=null){
            int leftMax = findMaxElement(root.left);
            int rightMax = findMaxElement(root.right);
            maxVal = leftMax>rightMax?leftMax:rightMax;
            maxVal = maxVal>root.data?maxVal:root.data;
        }
        return maxVal;
    }

    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node1 = new BinaryTreeNode(2);
        BinaryTreeNode node2 = new BinaryTreeNode(3);
        BinaryTreeNode node3 = new BinaryTreeNode(4);
        BinaryTreeNode node4 = new BinaryTreeNode(5);
        BinaryTreeNode node5 = new BinaryTreeNode(6);
        BinaryTreeNode node6 = new BinaryTreeNode(7);
        root.setLeft(node1);
        root.setRight(node2);
        node1.setLeft(node3);
        node1.setRight(node4);
        node2.setLeft(node5);
        node2.setRight(node6);
        System.out.println(FindMaxElement.findMaxElement(root));

    }
}
