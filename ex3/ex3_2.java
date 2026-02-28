package ex3;

/**
 * Exercise ex3_2: recursive selection sort.
 * Implements selection-sort using recursive helpers and demonstrates reuse of ex3_1.
 */
public class ex3_2 {

	/**
	 * Wrapper that begins recursive selection-sort on the full array.
	 * @param a array to be sorted in-place (may be null)
	 */
	public static void recursiveSelectionSort(int[] a) {
		if (a == null || a.length == 0)
			return;
		recursiveSort(a, 0);
	}

	/**
	 * Recursively sort the subarray starting at `start`.
	 * Each call finds the minimum of a[start..end] and swaps it into place.
	 */
	private static void recursiveSort(int[] a, int start) {
		if (start >= a.length - 1)
			return;

		// create copy of subarray a[start..end] (recursively) so we can use ex3_1.minRecursive
		int len = a.length - start;
		int[] sub = new int[len];
		copySubarray(a, start, sub, 0);

		int minVal = ex3_1.minRecursive(sub); // use previous section's function

		int minIdx = indexOfValueFrom(a, start, minVal);

		// swap a[start] and a[minIdx]
		int tmp = a[start];
		a[start] = a[minIdx];
		a[minIdx] = tmp;

		recursiveSort(a, start + 1);
	}

	/** copy a[srcIdx..] into dest[destIdx..] until dest is filled (recursive) */
	private static void copySubarray(int[] a, int srcIdx, int[] dest, int destIdx) {
		if (destIdx >= dest.length)
			return;
		dest[destIdx] = a[srcIdx];
		copySubarray(a, srcIdx + 1, dest, destIdx + 1);
	}

	/** find index of first occurrence of value in a starting from 'start' (recursive) */
	private static int indexOfValueFrom(int[] a, int start, int value) {
		return indexOfValueFrom(a, start, value, start);
	}

	private static int indexOfValueFrom(int[] a, int start, int value, int idx) {
		if (idx >= a.length)
			return -1; // should not happen if value exists
		if (a[idx] == value)
			return idx;
		return indexOfValueFrom(a, start, value, idx + 1);
	}
}
