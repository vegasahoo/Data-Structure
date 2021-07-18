package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class BinaryTreeNode {
    int data;
    BinaryTreeNode left, right;

    public BinaryTreeNode(int data){
        this.data = data;
        left = right = null;
    }

    public int getData() {
        return data;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    //Recursive
    public static void preOrderRecursive(BinaryTreeNode root){
        if(root!= null){
            System.out.println(root.data);
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    //Iterative
    public void preOrderIterative(BinaryTreeNode root){

        if(root== null){
            System.out.println("Tree is empty");
            return;
        }

        ArrayList<Integer> res = new ArrayList<>();
        Stack<BinaryTreeNode> stk = new Stack<>();
        stk.push(root);
        while(!stk.isEmpty()){
            BinaryTreeNode temp = stk.pop();
            res.add(temp.data);
            if(temp.right!=null){
                stk.push(temp.right);
            }
            if(temp.left!= null){
                stk.push(temp.left);
            }

        }
        for(int num : res){
            System.out.println(num);
        }
    }

    public static void inOrderRecursive(BinaryTreeNode root){
        if(root!=null){
            inOrderRecursive(root.left);
            System.out.println(root.data);
            inOrderRecursive(root.right);
        }
    }
    public void inOrderIterative(BinaryTreeNode root){
        Stack<BinaryTreeNode> stk = new Stack<>();
        BinaryTreeNode temp = root;
        ArrayList<Integer> res = new ArrayList<>();
        boolean done = false;
        while(!done){
            if(temp != null){
                stk.push(temp);
                temp = temp.left;
            }
            else{
                if(stk.isEmpty()){
                    done = true;
                }
                else{
                    temp = stk.pop();
                    res.add(temp.data);
                    temp = temp.right;
                }
            }
        }
        for(int a : res){
            System.out.println(a);
        }
    }

    public static void postOrderRecursive(BinaryTreeNode root){
        if(root!=null){
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.println(root.data);
        }
    }
}
