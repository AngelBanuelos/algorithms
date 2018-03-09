package com.tuinsomniacorp.leetcode.medium;

public class AmazonPathMatrix {
	
	
	public int findPath(int [][] maze, int rows, int columns, int exitRow, int exitColumn ){
		
		int min = Integer.MAX_VALUE;
		
		while (maze[0][0] != 1) {
			int tem = 0;
			int i = 0;
			int j = 0;
			
			while(j < exitColumn && maze[i][j] != 1) {
				int ii = i;
				int jj = j;
				
				if(j == exitColumn -1){
					i++;
					tem++;
				}
				
				if (exitColumn == j && exitRow == i) {
					maze[ii][jj] = 1;
					if (tem < min) {
						min = tem;
					}
					tem = 0;
					break;
				}
				
				j++;
				tem++;
			}
		}
		
		return min;
	}
	
	public static void main(String args []) {
		AmazonPathMatrix a = new AmazonPathMatrix();
		int [][] mazze = {{0,0,0,0},{1,0,1,0},{1,0,0,0}};
		a.findPath(mazze, 3, 4, 1, 1);
	}

}
