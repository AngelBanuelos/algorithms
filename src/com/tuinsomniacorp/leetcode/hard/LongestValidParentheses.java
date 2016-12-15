package com.tuinsomniacorp.leetcode.hard;

import java.util.Stack;

public class LongestValidParentheses {

	public static void main(String[] args) {

		LongestValidParentheses obj = new LongestValidParentheses();

		System.out.println("Longest Valid Parenthesis " + obj.longestValidParentheses("(()()((()()()(("));
		System.out.println("Longest Valid Parenthesis " + obj.isValidParentheses("[(){()}]"));

	}

	public int longestValidParentheses(String s) {
		Stack<Character> stack = new Stack<>();
		int longest = 0;
		char[] chr = s.toCharArray();

		int temp = 0;
		for (char c : chr) {

			if (c == '(') {
				stack.push(c);
				continue;
			}

			if (c == ')') {
				if (!stack.isEmpty()) {
					stack.pop();
					longest += 2;
				}
			}
		}

		return longest;
	}

	public boolean isValidParentheses(String s) {
		Stack<Character> stackIn = new Stack<>();
		char[] chr = s.toCharArray();

		char expected = '\u0000';
		for (char c : chr) {
			switch (c) {
			case '(':
			case '[':
			case '{':
				stackIn.push(c);
				break;
			case ')':
				if(stackIn.isEmpty()){
					return false;
				}
				expected = '(';
				char in = stackIn.pop();
				if(in != expected) {
					return false;
				}
				break;
			case ']':
				if(stackIn.isEmpty()){
					return false;
				}
				expected = '[';
				in = stackIn.pop();
				if(in != expected) {
					return false;
				}
				break;
			case '}':
				if(stackIn.isEmpty()){
					return false;
				}
				expected = '{';
				in = stackIn.pop();
				if(in != expected) {
					return false;
				}
				break;
			}
		}
		return stackIn.isEmpty();
	}

}
