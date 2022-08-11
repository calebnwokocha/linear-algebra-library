/*
 * Author: Caleb Nwokocha
 * School: The University of Manitoba
 * Department: Computer Science
 */

import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        double[][] matrixA = {
                {1, 2},
                {3, 4}
        };

        double[][] matrixB = {
                {1, 2, 5},
                {3, 4, 6},
                {7, 8, 9}
        };

        Algebra algebra = new Algebra();

        double[][] matrixDotProduct = algebra.multiply(matrixA, matrixB);

        System.out.println("The dot-product of " + Arrays.deepToString(matrixA) + " and " +
                Arrays.deepToString(matrixB) + " is " + Arrays.deepToString(matrixDotProduct) + ".");
    }
}
