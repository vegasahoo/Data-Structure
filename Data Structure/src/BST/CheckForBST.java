package BST;


public class CheckForBST {
	
	
	static boolean isBst(BSTNode root, BSTNode l, BSTNode r) {
		
		if(root == null) {
			return true;
		}
		
		if(l!=null && root.data<=l.data) {
			return false;
		}
		
		if(r!=null && root.data>=r.data) {
			return false;
		}
		
		return isBst(root.left,l,root) && isBst(root.right,root,r);
	}
	
	public static void main(String[] args) {
		BSTNode root = new BSTNode(4);
        BSTNode node1 = new BSTNode(1);
        BSTNode node2 = new BSTNode(2);
        BSTNode node3 = new BSTNode(3);
        BSTNode node5 = new BSTNode(5);
        BSTNode node6 = new BSTNode(6);
        BSTNode node7 = new BSTNode(7);
        
        root.setLeft(node2);
        root.setRight(node6);
        node2.setLeft(node1);
        node2.setRight(node3);
        node6.setLeft(node5);
        node6.setRight(node7);
        
        //BSTNode.inOrder(root);
        System.out.println(isBst(root, null, null));
       
	}

}
