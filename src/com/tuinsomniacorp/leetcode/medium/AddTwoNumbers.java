package com.tuinsomniacorp.leetcode.medium;

/**
 * You are given two linked lists representing two non-negative numbers. The
 * digits are stored in reverse order and each of their nodes contain a single
 * digit. Add the two numbers and return it as a linked list. Input: (2 -> 4 ->
 * 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 */
public class AddTwoNumbers {

	public class ListNode {

		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	ListNode list = null;
	ListNode lastNode = null;

	public void add(int value) {
		if (list == null) {
			list = new ListNode(value);
			lastNode = list;
			return;
		}

		ListNode l2 = lastNode.next;
		l2 = new ListNode(value);
		lastNode.next = l2;
		lastNode = l2;

	}

	public void print() {
		ListNode l = list;
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
		System.out.print("\n");
	}

	public void print(ListNode listNode) {
		ListNode l = listNode;
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		AddTwoNumbers l1 = new AddTwoNumbers();
		// 2 -> 4 -> 3
		l1.add(2);
		l1.add(4);
		l1.add(3);

		l1.print();

		AddTwoNumbers l2 = new AddTwoNumbers();
		// 5 -> 6 -> 4
		l2.add(0);
		l2.add(6);
		l2.add(4);

		l2.print();

		l1.print( l1.addTwoNumbers2(l1.list, l2.list, null, null, 0) );

	}
	
	public ListNode addTwoNumbers2(ListNode l1, ListNode l2, ListNode result, ListNode last, int carried) {

		if (l1 == null && l2 == null) {
			if (carried != 0) {
				ListNode newNode = new ListNode(carried);
				last.next = newNode;
				last = newNode;
			}
			return result;
		}
		
		int lVal = 0;
		if (l1 != null) {
			lVal = l1.val;
		}
		
		int llVal = 0;
		if (l2 != null) {
			llVal = l2.val;
		}

		int sum = (llVal + lVal + carried);
		carried = sum / 10;
		int value = sum % 10;

		ListNode newNode = new ListNode(value);

		if (result == null) {
			result = newNode;
			last = result;
		} else {
			last.next = newNode;
			last = newNode;
		}

		return addTwoNumbers2((l1 != null ? l1.next : null), (l2 != null ? l2.next : null), result, last, carried);

	}

}
