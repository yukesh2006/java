package day11;

public class SortedMatrixSearch {
	public static void main(String[] args) {
		int[][] matrix= {
				{10,20,30,40},
				{50,60,70,80},
				{90,100,110,120},
				{130,140,150,160}
		};
		int target=110;
		int row=0;
		int col=matrix[0].length-1;
		while(row<matrix.length && col>=0) {
			if(matrix[row][col]==target) {
				System.out.println("Element found");
				return;
			}else if(matrix[row][col]>target) {
				col--;
			}else {
				row++;
			}
		}
	}
}
