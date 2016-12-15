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

	public void add(int value) {
		if (list == null) {
			list = new ListNode(value);
			return;
		}

		ListNode l1 = list;
		ListNode l2 = l1.next;
		while (l2 != null) {
			l1 = l2;
			l2 = l1.next;

		}
		l2 = new ListNode(value);
		l1.next = l2;

	}

	public void print() {
		ListNode l = list;
		while (l != null) {
			System.out.print(l.val + " ");
			l = l.next;
		}
		System.out.print("\n");
	}

	public static void main(String[] args) {
		AddTwoNumbers l1 = new AddTwoNumbers();
		l1.add(8);
		l1.add(9);
		l1.add(5);

//		l1.print();

		AddTwoNumbers l2 = new AddTwoNumbers();
		l2.add(2);
		l2.add(0);
		l2.add(4);
//		l2.print();

		AddTwoNumbers.addTwoNumbers(l1.list, l2.list);
		System.out.println(5<<13%5);
		for(int i = 1 ; i <= 5 ; i ++){
			System.out.println((5 << i%5) );
		}

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		
		return null;
	}

}
