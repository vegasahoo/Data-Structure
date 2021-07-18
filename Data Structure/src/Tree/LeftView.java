package Tree;


public class LeftView {
	
	int maxLevel = 0;
    int level = 1;
    //Function to get the left view of the binary tree.
    void leftView(BinaryTreeNode root, int level)
    {
    	if(root==null){
	          return;
	      }
	      if(maxLevel<level){
	          System.out.println(root.data);
	          maxLevel=level; 
	      }
	      
	      leftView(root.left, level+1);
	      leftView(root.right, level+1);
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
		node6.setRight(node7);
        new LeftView().leftView(root, 1);
	}

}
