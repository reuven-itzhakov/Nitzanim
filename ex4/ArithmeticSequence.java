package ex4;

/**
 * Arithmetic sequence: first, first+diff, first+2*diff, ...
 */
public class ArithmeticSequence extends Sequence {
    /** common difference between consecutive elements */
    private final double diff;
    /** number of ArithmeticSequence instances */
    private static int count = 0;

    /**
     * Create an arithmetic sequence of length `n`.
     *
     * @param n number of elements (>=1)
     * @param first first element
     * @param diff common difference
     */
    public ArithmeticSequence(int n, double first, double diff) {
        super(n, first);
        this.diff = diff;
        count++;
    }

    /**
     * Sum of arithmetic progression using the closed-form formula.
     */
    @Override
    public double sum() {
        return (double) n * (2 * first + (n - 1) * diff) / 2.0;
    }

    /**
     * Build and return an array with the sequence elements.
     */
    @Override
    public double[] elements() {
        double[] a = new double[n];
        for (int i = 0; i < n; i++)
            a[i] = first + i * diff;
        return a;
    }

    /** @return how many ArithmeticSequence instances were created */
    public static int getCount() {
        return count;
    }

    /** simple human-readable representation */
    @Override
    public String toString() {
        return String.format("ArithmeticSequence(n=%d, first=%s, diff=%s)", n, first, diff);
    }
}
