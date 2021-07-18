package BST;

public class FindMaxMin {
	
	
	static int findMin(BSTNode root) {
		while(root.left!=null) {
			root = root.left; 
		}
		return root.data;
	}
	
	static int findMax(BSTNode root) {
		while(root.right !=null) {
			root = root.right;
		}
		return root.data;
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
        
        System.out.println(findMin(root));
        System.out.println(findMax(root));
	}

}
