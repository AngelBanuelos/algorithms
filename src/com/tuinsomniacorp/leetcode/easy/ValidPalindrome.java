package com.tuinsomniacorp.leetcode.easy;

/**
 * 
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * For example, "A man, a plan, a canal: Panama" is a palindrome. "race a car"
 * is not a palindrome.
 * 
 * Note: Have you consider that the string might be empty? This is a good
 * question to ask during an interview.
 * 
 * For the purpose of this problem, we define empty string as valid palindrome.
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 */
public class ValidPalindrome {

	public boolean isPalindrome(String s) {
		s = s.toUpperCase();
		int i = 0;
		int n = s.length() - 1;
		while (i < n) {
			char x = s.charAt(i);
			char y = s.charAt(n);
			// Letter Number
			if (!isCharacter(x) && !isNumeric(x)) {
				i++;
				continue;
			} else if (!isCharacter(y) && !isNumeric(y)) {
				n--;
				continue;
			}

			if (x != y) {
				return false;
			}
			i++;
			n--;
		}

		return true;
	}

	public boolean isNumeric(char c) {
		if (c >= 48 && c <= 57) {
			return true;
		}
		return false;
	}

	public boolean isCharacter(char c) {
		if (c >= 65 && c <= 90) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		String word = "A man, a plan, a canal: Panama";
		String easy = "0P";
		String trick = "";

		ValidPalindrome validPalindrome = new ValidPalindrome();
		System.out.println("is a palindtrome: " + validPalindrome.isPalindrome(easy));
		System.out.println("is a palindtrome: " + validPalindrome.isPalindrome(word));
		System.out.println("is a palindtrome: " + validPalindrome.isPalindrome(trick));

	}

}
