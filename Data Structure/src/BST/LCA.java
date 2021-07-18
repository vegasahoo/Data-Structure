package BST;

public class LCA {
	
	
	static BSTNode findLCA(BSTNode node, BSTNode n1, BSTNode n2) {
		
		if(node== null){
            	    return null;
        	}
        
        if(node.data<n1.data && node.data<n2.data){
            return findLCA(node.right, n1, n2);
        }
        
        if(node.data>n1.data && node.data > n2.data){
            return findLCA(node.left, n1,n2);
        }
        
        return node;
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
        
        System.out.println(findLCA(root,node1, node7).data);
	}

}
