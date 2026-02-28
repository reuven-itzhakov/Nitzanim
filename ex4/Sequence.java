package ex4;

/**
 * Base abstract class for numeric sequences.
 * Stores common properties and defines the interface for concrete sequences.
 */
public abstract class Sequence {
    /** number of elements in the sequence (must be >= 1) */
    protected final int n;
    /** first element of the sequence */
    protected final double first;
    /** total number of Sequence instances created (across subclasses) */
    private static int totalCount = 0;

    /**
     * Construct a sequence with given length and first value.
     *
     * @param n number of elements (must be >= 1)
     * @param first first element value
     */
    protected Sequence(int n, double first) {
        if (n < 1)
            throw new IllegalArgumentException("n must be at least 1");
        this.n = n;
        this.first = first;
        totalCount++;
    }

    /** @return the number of elements in this sequence */
    public int length() { return n; }

    /** @return the first element value */
    public double first() { return first; }

    /** @return total number of Sequence instances created */
    public static int getTotalCount() { return totalCount; }

    /** @return the sum of the sequence elements */
    public abstract double sum();

    /** @return the average value of the sequence elements */
    public double average() { return sum() / n; }

    /** @return an array containing the sequence elements (length == n) */
    public abstract double[] elements();

    /** @return a short human-readable description of the sequence */
    public abstract String toString();
}
