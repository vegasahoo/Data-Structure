package Tree;

import java.util.Map;
import java.util.TreeMap;



public class BottomView {	
	
	static void inOrder(BinaryTreeNode root, int width, int height, TreeMap<Integer, Pair> map) {
		
		if(root==null) {
			return;
		}
		
		inOrder(root.left, width-1, height+1, map);
		if(!map.containsKey(width)) {
			map.put(width,  new Pair(root.data, height));
		}
		else if(map.get(width).height<height) {
			map.put(width, new Pair(root.data, height));
		}
		inOrder(root.right,width+1,height+1, map);
	}
	
	static void bottomView(BinaryTreeNode root) {
		TreeMap<Integer, Pair> map = new TreeMap<Integer, Pair>();
		inOrder(root, 0,0 , map);
		
		for(Map.Entry<Integer, Pair> i : map.entrySet()) {
			System.out.println(i.getValue().data+ " ");
		}
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
		bottomView(root);
	}

}
