package Tree;

import java.util.Stack;

public class SearchingElement {

    static boolean findElementRecursive(BinaryTreeNode root, int num){
        if(root!=null){
            if(root.data == num){
                return true;
            }
            return findElementRecursive(root.left, num) || findElementRecursive(root.right, num);
        }
        else{
            return false;
        }
    }
    
    static boolean findElementIterative(BinaryTreeNode root, int num){
        Stack<BinaryTreeNode> stk  = new Stack<BinaryTreeNode>();
        stk.push(root);
        while(!stk.isEmpty()){
            BinaryTreeNode temp = stk.pop();
            if(temp.data == num){
                return true;
            }
            if(temp.left!= null){
                stk.push(temp.left);
            }
            if(temp.right!=null){
                stk.push(temp.right);
            }

        }
        return false;
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

        System.out.println(SearchingElement.findElementRecursive(root, 2));
    }

}
