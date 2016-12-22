package com.tuinsomniacorp.learning.tree;

import com.tuinsomniacorp.learning.sort.CountingSort;
import com.tuinsomniacorp.learning.utils.Utils;

public class BinaryTree<T extends Tree> {

	class Node<T> {

		public Node(T value) {
			this.value = value;
		}

		Node<T> left;
		Node<T> right;

		T value;
	}

	Node<T> root;

	public void addchild(T child) {

		if (root == null) {
			root = new Node<>(child);
			return;
		}
		add(root, child);

	}

	private void add(Node<T> node, T value) {

		if (node == null) {
			node = new Node<T>(value);
			return;
		}

		// left
		if (value.compareTo(node.value) < 0) {

			if (node.left == null) {
				node.left = new Node<T>(value);
				return;
			} else {
				add(node.left, value);
			}

		} else {
			// right
			if (node.right == null) {
				node.right = new Node<T>(value);
				return;
			} else {
				add(node.right, value);
			}

		}
	}

	@Override
	public String toString() {
		String toString = "";
		return print(root, toString);
	}

	private String print(Node<T> node, String toString) {

		if (node == null) {
			return toString;
		}
		print(node.left, toString);

		return print(node.right, toString += node.value + " -- ");
	}

	public static void main(String[] args) {

		BinaryTree<IntegerTree> tree = new BinaryTree<>();
		System.out.println(" Start " + tree);
		for (int i = 0; i < 10; i++) {
			IntegerTree ii = new IntegerTree(i);
			tree.addchild(ii);
		}
		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Finished " + tree);

		tree.createBalanceTree(Utils.createArray(100_000, -15, 15));
		tree.createBalanceTree(array);
		

	}

	public void createBalanceTree(int[] array) {
		if (!Utils.isSorted(array)) {
			CountingSort counting = new CountingSort();
			counting.sort(array);
		}
		balanceTree = new BinaryTree<IntegerTree>();
		balanceTree(array, 0, array.length);
		System.out.println(balanceTree);
	}

	private BinaryTree<IntegerTree> balanceTree;

	private void balanceTree(int[] array, int start, int end) {

		int half = (end - start) / 2;
		if (start >= end) {
			return;
		}

		half += start;
		balanceTree.addchild(new IntegerTree(array[half]));
		
		balanceTree(array, start, half);
		balanceTree(array, half + 1, end);
	}

}
