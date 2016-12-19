package com.tuinsomniacorp.leetcode.medium;

/**
 * Given an 2D board, count how many different battleships are in it. The
 * battleships are represented with 'X's, empty slots are represented with '.'s.
 * You may assume the following rules:
 * 
 * You receive a valid board, made of only battleships or empty slots.
 * Battleships can only be placed horizontally or vertically. In other words,
 * they can only be made of the shape 1xN (1 row, N columns) or Nx1 (N rows, 1
 * column), where N can be of any size. At least one horizontal or vertical cell
 * separates between two battleships - there are no adjacent battleships.
 * Example: X..X ...X ...X In the above board there are 2 battleships. Invalid
 * Example: ...X XXXX ...X This is an invalid board that you will not receive -
 * as battleships will always have a cell separating between them.
 * 
 * Follow up: Could you do it in one-pass, using only O(1) extra memory and
 * without modifying the value of the board?
 * 
 * @author Angel Banuelos ing.angel.banuelos@gmail.com
 *
 */
public class BattleshipsBoard {

	public int countBattleships(char[][] board) {
		int sum = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == 'X') {
					if (i == 0 && j == 0) {
						sum++;
					} else if (j > 0 && (board[i][j - 1] == 'X')) {
						continue;
					} else if (i > 0 && (board[i - 1][j] == 'X')) {
						continue;
					} else {
						sum++;
					}
				}
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		char[][] board = { "X...X".toCharArray(), "....X".toCharArray(), "....X".toCharArray(), "XX...".toCharArray() };
		char[][] board2 = { "XXX..".toCharArray(), "...X.".toCharArray(), "XXX.X".toCharArray(),
				"...X.".toCharArray() };
		// "X..X","...X","...X"
		char[][] board3 = { "X..X".toCharArray(), "...X".toCharArray(), "...X".toCharArray(), "...X.".toCharArray() };
		char[][] board4 = { "X..X".toCharArray(), ".XX.".toCharArray(), ".XX.".toCharArray(), ".XX.".toCharArray(),
				"X..X.".toCharArray() };

		BattleshipsBoard battle = new BattleshipsBoard();

		System.out.println(battle.countBattleships(board));
		System.out.println(battle.countBattleships(board2));
		System.out.println(battle.countBattleships(board3));
		System.out.println(battle.countBattleships(board4));

	}

}
