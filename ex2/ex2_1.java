package ex2;

/**
 * Exercise ex2_1: matrix utilities.
 * Contains a helper that checks whether a rectangular submatrix sums to zero.
 */
public class ex2_1 {
	/**
	 * Check whether the submatrix defined by top-left (r1,c1) and bottom-right (r2,c2)
	 * contains values that sum to zero.
	 * Performs argument validation and throws IllegalArgumentException for invalid inputs.
	 *
	 * @param a  input 2D array (must not be null, rows may not be null)
	 * @param r1 top row index (inclusive)
	 * @param c1 left column index (inclusive)
	 * @param r2 bottom row index (inclusive)
	 * @param c2 right column index (inclusive)
	 * @return true if the sum over the specified rectangle is 0, false otherwise
	 */
	public static boolean isZeroSubmatrix(int[][] a, int r1, int c1, int r2, int c2) {
		if (a == null)
			throw new IllegalArgumentException("array is null");
		if (r1 < 0 || c1 < 0 || r2 < 0 || c2 < 0)
            throw new IllegalArgumentException("indices must be non-negative");
		if (r1 > r2 || c1 > c2)
			throw new IllegalArgumentException("top-left must be <= bottom-right");
		if (r2 >= a.length)
			throw new IllegalArgumentException("row index out of bounds");

		int sum = 0;
		for (int i = r1; i <= r2; i++) {
			int[] row = a[i];
			if (row == null)
				throw new IllegalArgumentException("row " + i + " is null");
			if (c2 >= row.length)
				throw new IllegalArgumentException("column index out of bounds for row " + i);
			for (int j = c1; j <= c2; j++)
				sum += row[j];
		}
		return sum == 0;
	}
}
