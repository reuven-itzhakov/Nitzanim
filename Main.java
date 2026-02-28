import java.util.Arrays;

import ex4.ArithmeticSequence;
import ex4.GeometricSequence;

public class Main {
    public static void main(String[] args) {
        // ex1.1: invertCase
        System.out.println("--- ex1_1 invertCase ---");
        String s = "Hello World! 123 AbC";
        System.out.println("input : " + s);
        System.out.println("output: " + ex1.ex1_1.invertCase(s));

        // ex2.1: isZeroSubmatrix
        System.out.println("\n--- ex2_1 isZeroSubmatrix ---");
        int[][] a = { {1, -1, 0}, {2, -2, 0}, {0, 0, 0} };
        System.out.println(ex2.ex2_1.isZeroSubmatrix(a, 0, 0, 1, 1));
        System.out.println(ex2.ex2_1.isZeroSubmatrix(a, 0, 0, 2, 2));
        System.out.println(ex2.ex2_1.isZeroSubmatrix(a, 0, 0, 0, 0));

        // ex2.2: generateRandomMatrix + countZeroSubmatrices
        System.out.println("\n--- ex2_2 generate + count ---");
        int[][] rand = ex2.ex2_2.generateRandomMatrix(5, 5);
        printMatrix(rand);
        System.out.println("zero submatrices: " + ex2.ex2_2.countZeroSubmatrices(rand));

        // ex3.1: minRecursive
        System.out.println("\n--- ex3_1 minRecursive ---");
        int[] example = {3, -1, 7, 0, -5};
        System.out.println("min: " + ex3.ex3_1.minRecursive(example));

        // ex3.2: recursiveSelectionSort
        System.out.println("\n--- ex3_2 recursiveSelectionSort ---");
        int[] toSort = {5, 2, -1, 7, 0, -3};
        System.out.println("before: " + Arrays.toString(toSort));
        ex3.ex3_2.recursiveSelectionSort(toSort);
        System.out.println("after : " + Arrays.toString(toSort));

        // Sequences: Arithmetic and Geometric
        System.out.println("\n--- Sequences ---");
        ArithmeticSequence aseq = new ArithmeticSequence(5, 2.0, 3.0);
        GeometricSequence gseq = new GeometricSequence(5, 2.0, 3.0);
        System.out.println(aseq);
        System.out.println("elements: " + Arrays.toString(aseq.elements()));
        System.out.println("sum: " + aseq.sum() + " avg: " + aseq.average());

        System.out.println(gseq);
        System.out.println("elements: " + Arrays.toString(gseq.elements()));
        System.out.println("sum: " + gseq.sum() + " avg: " + gseq.average());

        System.out.println("ArithmeticSequence.count=" + ArithmeticSequence.getCount());
        System.out.println("GeometricSequence.count=" + GeometricSequence.getCount());
    }

    private static void printMatrix(int[][] m) {
        for (int[] row : m) System.out.println(Arrays.toString(row));
    }
}
