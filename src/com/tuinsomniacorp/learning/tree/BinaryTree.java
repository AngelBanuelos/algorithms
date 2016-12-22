package com.tuinsomniacorp.learning.tree;


public class BinaryTree<T extends Tree> {
	
	class Node <T> {
		
		public Node(T leftValue, T rightValue, T value) {
			this.leftValue = leftValue;
			this.rightValue =  rightValue;
			this.value = value;
		}
		
		Node<T> left;
		Node<T> right;
		
		T value;
		T leftValue;
		T rightValue;

	}
	
	Node<T> root;
	
	public void  addchild(T child){
		
		if (root == null ) {
			root = new Node<>(null, null, child);
			return;
		}
		add(root, child);
		
	}

	private void add(Node<T> node, T value) {
		
		if (node == null) {
			node = new Node<T>(null, null, value);
			return;
		}
		
		// left
		if (value.compareTo(node) < 0) {
			
			if (node.left == null) {
				node.left = new Node<T>(null, null, value);
				return;
			} else {
				add(node.left, value);
			}
			
		} else {
			// right
			if (node.left == null) {
				node.right = new Node<T>(null, null, value);
				return;
			} else {
				add(node.right, value);
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		BinaryTree<IntegerTree> tree =  new BinaryTree<>();
		
		for (int i = 0; i < 10; i++) {
			IntegerTree ii =  new IntegerTree(i);
			tree.addchild(ii);
		}
		System.out.println("Finished ");
		
	}
	

}
