import java.util.Scanner;

public class MaxValuePath {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[][] grid = new int[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				grid[i][j] = sc.nextInt();
				// System.out.println(arr[i][j]);
			}
		}
		sc.close();

		for (int i = grid.length - 1; i >= 0; i--) {
			for (int j = grid[i].length - 1; j >= 0; j--) {
				int temp;
				if (i + 1 < grid.length && j + 1 < grid[i].length)
					temp = Math.max(grid[i + 1][j], grid[i][j + 1]);
				else if (i + 1 < grid.length)
					temp = grid[i + 1][j];
				else if (j + 1 < grid[i].length)
					temp = grid[i][j + 1];
				else
					temp = 0;
				grid[i][j] += temp;
			}
		}
		System.out.println(Integer.toString(grid[0][0]));
	}
}
