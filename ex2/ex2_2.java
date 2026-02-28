package ex2;

import java.util.Random;
import java.util.Scanner;

/**
 * Exercise ex2_2: matrix generation and counting utilities.
 * - Read dimensions from user (>=5)
 * - Generate a random matrix with values in -2..2
 * - Count how many rectangular submatrices sum to zero using ex2_1
 */
public class ex2_2 {

	/**
	 * Prompt the user until they enter two integers >= 5.
	 * @return an int array of length 2 containing {rows, cols}
	 */
	public static int[] readAtLeastFive() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Enter rows and cols (>= 5), e.g. \"10 5\": ");
			if (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Invalid input - please enter two integers.");
				continue;
			}
			int r = sc.nextInt();
			if (!sc.hasNextInt()) {
				System.out.println("Please enter two integers.");
				continue;
			}
			int c = sc.nextInt();
			if (r >= 5 && c >= 5)
				return new int[] { r, c };
			System.out.println("Both values must be at least 5 - try again.");
		}
	}

	/**
	 * Create a rows x cols matrix filled with random integers in the range [-2, 2].
	 * @param rows number of rows (must be >= 0)
	 * @param cols number of columns (must be >= 0)
	 * @return a newly allocated int[rows][cols] with values in [-2, 2]
	 */
	public static int[][] generateRandomMatrix(int rows, int cols) {
		Random rnd = new Random();
		int[][] a = new int[rows][cols];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				a[i][j] = rnd.nextInt(5) - 2; // -2..2

		return a;
	}

	/**
	 * Count how many axis-aligned submatrices (all possible r1,c1,r2,c2) sum to zero.
	 * Uses the helper from ex2_1 to check each rectangle.
	 * @param a input matrix (may not be null or empty)
	 * @return the number of rectangular submatrices whose sum equals zero
	 */
	public static long countZeroSubmatrices(int[][] a) {
		if (a == null || a.length == 0) return 0L;
		int m = a.length;
		int n = a[0].length;
		long count = 0L;
		for (int r1 = 0; r1 < m; r1++)
			for (int c1 = 0; c1 < n; c1++)
				for (int r2 = r1; r2 < m; r2++)
					for (int c2 = c1; c2 < n; c2++)
						if (ex2_1.isZeroSubmatrix(a, r1, c1, r2, c2)) count++;

		return count;
	}

	/**
	 * Print the matrix to stdout with simple formatting.
	 * @param a matrix to print (rows may not be null)
	 */
	public static void printMatrix(int[][] a) {
		for (int[] row : a) {
			for (int v : row) System.out.printf("%3d", v);
			System.out.println();
		}
	}
}
