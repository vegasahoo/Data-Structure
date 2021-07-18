package BST;

public class Predecessor {
	
	static BSTNode findPre(BSTNode root, int data) {
		
		BSTNode temp = root;
		
		while(root!=null) {
			if(root.data == data) {
				return temp;
			}
			
			else if(root.data>data) {
				temp = root;
				root= root.left;
			}
			else {
				temp = root;
				root = root.right;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		BSTNode root = new BSTNode(4);
        BSTNode node1 = new BSTNode(1);
        BSTNode node2 = new BSTNode(2);
        BSTNode node3 = new BSTNode(3);
        BSTNode node5 = new BSTNode(5);
        BSTNode node6 = new BSTNode(6);
        BSTNode node7 = new BSTNode(7);
        BSTNode node8 = new BSTNode(8);
        BSTNode node0 = new BSTNode(0);
        
        root.setLeft(node2);
        root.setRight(node6);
        node2.setLeft(node1);
        node2.setRight(node3);
        node6.setLeft(node5);
        node6.setRight(node7);
        node7.setRight(node8);
        node1.setLeft(node0);
        System.out.println(findPre(root,0).data);
	}

}
