import java.util.Arrays;

public class Main {
    public static void main (String[] args) {
        double[][] matrix1 = {
                {1, 2},
                {3, 4}
        };

        double[][] matrix2 = {
                {1, 2, 5},
                {3, 4, 6},
                {7, 8, 9}
        };

        Algebra algebra = new Algebra();

        double[][] matrixDotProduct = algebra.multiply(matrix1, matrix2);

        System.out.println("The dot-product of " + Arrays.deepToString(matrix1) + " and " +
                Arrays.deepToString(matrix2) + " is " + Arrays.deepToString(matrixDotProduct) + ".");
    }
}
