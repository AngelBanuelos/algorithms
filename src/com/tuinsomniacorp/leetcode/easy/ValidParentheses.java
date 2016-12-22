package com.tuinsomniacorp.leetcode.easy;

import java.util.Stack;
/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 */
public class ValidParentheses {

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
				if (stackIn.isEmpty()) {
					return false;
				}
				expected = '(';
				char in = stackIn.pop();
				if (in != expected) {
					return false;
				}
				break;
			case ']':
				if (stackIn.isEmpty()) {
					return false;
				}
				expected = '[';
				in = stackIn.pop();
				if (in != expected) {
					return false;
				}
				break;
			case '}':
				if (stackIn.isEmpty()) {
					return false;
				}
				expected = '{';
				in = stackIn.pop();
				if (in != expected) {
					return false;
				}
				break;
			}
		}
		return stackIn.isEmpty();
	}
			
}
