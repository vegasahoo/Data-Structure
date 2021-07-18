package Tree;

public class DiameterOfTree {
	
	
	static int dia(BinaryTreeNode root) {
		int dia = 0;
		if(root==null) {
			return 0;
		}
		int l = dia(root.left);
		int r = dia(root.right);
		
		if(l+r+1>dia) {
			dia  = l+r+1;
		}
		
		return 1+Math.max(l, r);
		
	}
	
	
	public static void main(String[] args) {
		BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode node1 = new BinaryTreeNode(2);
        BinaryTreeNode node2 = new BinaryTreeNode(3);
        BinaryTreeNode node3 = new BinaryTreeNode(4);
        BinaryTreeNode node4 = new BinaryTreeNode(5);
        BinaryTreeNode node5 = new BinaryTreeNode(6);
        BinaryTreeNode node6 = new BinaryTreeNode(7);
        //BinaryTreeNode node7 = new BinaryTreeNode(8);
        root.setLeft(node1);
        root.setRight(node2);
		node1.setLeft(node3); 
		node1.setRight(node4); 
		node2.setLeft(node5);
		node2.setRight(node6);
		
		BinaryTreeNode.preOrderRecursive(root);
		//System.out.println(dia(root));
	}

}
