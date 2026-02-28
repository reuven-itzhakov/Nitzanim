package ex3;

/**
 * Exercise ex3_1: recursive minimum finder.
 * Demonstrates a simple tail-recursive-like approach to find the minimum in an array.
 */
public class ex3_1 {
    
	/**
	 * Wrapper that validates input and starts the recursive scan.
	 * @param a input array (must contain at least one element)
	 * @return minimum value in the array
	 */
	public static int minRecursive(int[] a) {
		if (a == null || a.length == 0)
			throw new IllegalArgumentException("array must have at least one element");
		return minRecursive(a, 1, a[0]);
	}

	/**
	 * Recursive helper: scan from index 'idx' keeping the current minimum value.
	 * This function advances the index and carries the running minimum as a parameter.
	 */
	private static int minRecursive(int[] a, int idx, int currentMin) {
		if (idx >= a.length)
			return currentMin;
		int nextMin = (a[idx] < currentMin) ? a[idx] : currentMin;
		return minRecursive(a, idx + 1, nextMin);
	}
}