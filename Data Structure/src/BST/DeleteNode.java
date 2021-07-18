package BST;

public class DeleteNode {
	
	static void deleteNode(BSTNode root, int data) {
		
		BSTNode node = FindElement.findElement(root, data);
		if(node==null) {
			System.out.println("Node not found in the tree");
			return;
		}
		
		BSTNode pre = Predecessor.findPre(root, node.data);
		if(node.data<pre.data) {
			//then node lies in the left side of pre
			if(node.right!=null) {
				pre.setLeft(node.right);
			}
			else {
				pre.setLeft(node.left);
			}
			
		}
		else {
			if(node.right!=null) {
				pre.setRight(node.right);
			}
			else {
				pre.setRight(node.left);
			}
			
		}
		if(node.right!=null) {
			BSTNode temp = node.right;
			while(temp.left!=null) {
				temp = temp.left;
			}
			temp.setLeft(node.left);
		}
		
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
        
        
        deleteNode(root, 8);
        BSTNode.inOrder(root);
	}

}
