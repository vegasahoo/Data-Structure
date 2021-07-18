package Tree;

public class MirrorTree {
	
	//This will create a new Tree
	static BinaryTreeNode mirrorTree(BinaryTreeNode root) {
		if(root==null) {
			return null;
		}
		
		BinaryTreeNode mirror = new BinaryTreeNode(root.data);
		mirror.setLeft(mirrorTree(root.right));
		mirror.setRight(mirrorTree(root.left));
		return mirror;
	}
	
	
	//This will modify the original Tree
	static BinaryTreeNode mirror(BinaryTreeNode root) {
		if(root==null) {
			return null;
		}
		
		BinaryTreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		if(root.left!= null) {
			mirror(root.left);
		}
		
		if(root.right!= null) {
			mirror(root.right);
		}
		return root;
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
        
        //BinaryTreeNode.preOrderRecursive(root);
        
        BinaryTreeNode.preOrderRecursive(mirror(root));
        
	}

}
