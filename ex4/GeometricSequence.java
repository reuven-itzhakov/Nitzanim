package ex4;

/**
 * Geometric sequence: first, first*ratio, first*ratio^2, ...
 */
public class GeometricSequence extends Sequence {
    /** multiplicative ratio between consecutive elements */
    private final double ratio;
    /** number of GeometricSequence instances */
    private static int count = 0;

    /**
     * Construct a geometric sequence of length `n`.
     *
     * @param n number of elements (>=1)
     * @param first first element
     * @param ratio multiplicative ratio
     */
    public GeometricSequence(int n, double first, double ratio) {
        super(n, first);
        this.ratio = ratio;
        count++;
    }

    /**
     * Sum of geometric progression. Handles the ratio == 1 corner-case.
     */
    @Override
    public double sum() {
        if (ratio == 1.0)
            return n * first;
        return first * (Math.pow(ratio, n) - 1.0) / (ratio - 1.0);
    }

    /**
     * Return an array containing the sequence elements.
     */
    @Override
    public double[] elements() {
        double[] a = new double[n];
        a[0] = first;
        for (int i = 1; i < n; i++)
            a[i] = a[i-1] * ratio;
        return a;
    }

    /** @return how many GeometricSequence instances were created */
    public static int getCount() {
        return count;
    }

    /** simple human-readable representation */
    @Override
    public String toString() {
        return String.format("GeometricSequence(n=%d, first=%s, ratio=%s)", n, first, ratio);
    }
}
