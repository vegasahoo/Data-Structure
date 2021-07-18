package Tree;

public class SizeOfTree {

	
	static int size(BinaryTreeNode root){ 
		int leftCount = root.left==null?0:size(root.left); 
		int rightCount =root.right==null?0:size(root.right); 
		return leftCount+rightCount+1; 
	}
	 
    static int height(BinaryTreeNode root){
        int leftHeight = root.left== null?0:height(root.left);
        int rightHeight = root.right==null?0:height(root.right);
        return leftHeight>rightHeight?leftHeight+1:rightHeight+1;
    }
    
    static int sizeNew(BinaryTreeNode root) {
    	
    	int size = 0;    	
    	if(root!= null) {
    		size ++;
    		size += sizeNew(root.left);
    		size += sizeNew(root.right);
    		return size;
    	}
    	return 0; 	
    }
    
    public static void main(String[] args) {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node1 = new BinaryTreeNode(2);
        BinaryTreeNode node2 = new BinaryTreeNode(3);
        BinaryTreeNode node3 = new BinaryTreeNode(4);
        BinaryTreeNode node4 = new BinaryTreeNode(5);
        BinaryTreeNode node5 = new BinaryTreeNode(6);
        BinaryTreeNode node6 = new BinaryTreeNode(7);
        BinaryTreeNode node7 = new BinaryTreeNode(8);
        root.setLeft(node1);
        root.setRight(node2);
		node1.setLeft(node3); 
		node1.setRight(node4); 
		node2.setLeft(node5);
		node2.setRight(node6);
		node3.setRight(node7);
		root.inOrderIterative(root);
        System.out.println(SizeOfTree.height(root));
        //System.out.println(SizeOfTree.sizeNew(root));
    }

}
