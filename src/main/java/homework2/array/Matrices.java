package homework2.array;

import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        testMatrix();
    }
    public static void print(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for(int i = 0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {

        if(matrix2.length != matrix1.length) {
            return false;
        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }
        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {
        if(matrix1.length != matrix2.length) {
            return false;
        }
        if (matrix1[0].length != matrix2[0].length) {
            return false;
        }
        return true;
    }
    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i<matrix1.length; i++){
            for(int j=0; j< matrix1[i].length; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        double[][] sum = new double[matrix1.length][matrix1[0].length];
        for(int i = 0; i<matrix1.length; i++){
            for(int j=0; j< matrix1[i].length; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return sum;
    }
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {

        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for(int i = 0; i<matrix1.length; i++){
            for(int j=0; j< matrix1[0].length; j++){
                sum[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sum;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        double[][] sum = new double[matrix1.length][matrix1[0].length];
        for(int i = 0; i<matrix1.length; i++){
            for(int j=0; j< matrix1[i].length; j++){
                sum[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return sum;    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int[][] mul = new int[matrix1.length][matrix2[0].length];
        for(int i = 0; i<matrix1.length; i++){
            for(int j=0; j< matrix2[0].length; j++){
                for(int k=0; k<matrix1[i].length; k++)
                mul[i][j] += matrix1[i][k] * matrix2[k][j];
            }
        }
        return mul;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        double[][] mul = new double[matrix1.length][matrix2[0].length];
        for(int i = 0; i<matrix1.length; i++){
            for(int j = 0; j<matrix2[0].length; j++){
                for(int k = 0; k<matrix1[i].length; k++){
                    mul[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return mul;
    }

    public static void testMatrix() {
        Scanner in = new Scanner(System.in);

        /* ================= INT MATRIX ================= */

        System.out.print("Enter rows and cols of int matrix A: ");
        int r1 = in.nextInt();
        int c1 = in.nextInt();

        int[][] A = new int[r1][c1];
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = in.nextInt();

        System.out.print("Enter rows and cols of int matrix B: ");
        int r2 = in.nextInt();
        int c2 = in.nextInt();

        int[][] B = new int[r2][c2];
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = in.nextInt();

        if (haveSameDimension(A, B)) {
            System.out.println("A + B:");
            print(add(A, B));

            System.out.println("A - B:");
            print(subtract(A, B));
        } else {
            System.out.println("Cannot add/subtract: different dimensions");
        }

        if (c1 == r2) {
            System.out.println("A * B:");
            print(multiply(A, B));
        } else {
            System.out.println("Cannot multiply A * B");
        }

        /* ================= DOUBLE MATRIX ================= */

        System.out.print("\nEnter rows and cols of double matrix X: ");
        r1 = in.nextInt();
        c1 = in.nextInt();

        double[][] X = new double[r1][c1];
        System.out.println("Enter elements of matrix X:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                X[i][j] = in.nextDouble();

        System.out.print("Enter rows and cols of double matrix Y: ");
        r2 = in.nextInt();
        c2 = in.nextInt();

        double[][] Y = new double[r2][c2];
        System.out.println("Enter elements of matrix Y:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                Y[i][j] = in.nextDouble();

        if (haveSameDimension(X, Y)) {
            System.out.println("X + Y:");
            print(add(X, Y));

            System.out.println("X - Y:");
            print(subtract(X, Y));
        } else {
            System.out.println("Cannot add/subtract: different dimensions");
        }

        if (c1 == r2) {
            System.out.println("X * Y:");
            print(multiply(X, Y));
        } else {
            System.out.println("Cannot multiply X * Y");
        }}

}
