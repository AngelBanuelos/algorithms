package com.tuinsomniacorp.learning.list;

import com.tuinsomniacorp.leetcode.medium.AddTwoNumbers.ListNode;

/**
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 * @param <T>
 */
public class LinkedList<T> {

	class Node<T> {

		T value;
		Node<T> next;

		Node(T value, Node<T> next) {
			this.value = value;
			this.next = next;
		}

		@Override
		public String toString() {
			return value.toString();
		}

	}

	Node<T> top = new Node<T>(null, null);
	Node<T> last = top.next;
	public void add(T value) {
		//add(value, top);
		add2(value, top);
	}

	/**
	 * Linear insertion 
	 * @param value
	 * @param top
	 */
	private void add(T value, Node<T> top) {
		Node<T> newValue = new Node<T>(value, null);
		if (top.next == null) {
			top.next = newValue;
			last = top.next;
			return;
		}
		Node<T> l1 = top.next;
		Node<T> l2 = l1.next;
		while (l2 != null) {
			l1  =  l2;
			l2 = l1.next;
		}
		l2 = newValue;
		l1.next = l2;
		last = l1.next;
		
	}
	
	/**
	 * Constant insertion 
	 * 
	 * @param value
	 * @param top
	 */
	private void add2(T value, Node<T> top) {
		Node<T> newValue = new Node<T>(value, null);
		if (top.next == null) {
			top.next = newValue;
			last = top.next;
			return;
		}
		last.next = newValue;
		last = last.next;
		
	}

	public void delete(Node nodeDelete) {

	}

	public void print() {
		Node<T> helper = top.next;
		while (helper != null) {
			System.out.println("Value : " + helper.value);
			helper = helper.next;
		}
	}
	
	public T getLast(){
		return last.value;
	}

	public static void main(String[] args) {
		LinkedList<com.tuinsomniacorp.learning.list.Node> linkedList = new LinkedList<>();
		
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100_000_000; i++) {
			com.tuinsomniacorp.learning.list.Node node = new com.tuinsomniacorp.learning.list.Node();
			node.setValue(i);
			linkedList.add(node);
		}
		long end = System.currentTimeMillis();
		System.out.println("Exectution time: " + (end - start));
		
	}

}
