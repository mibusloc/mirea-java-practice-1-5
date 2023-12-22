package ru.mirea.lab4_1.task4;

public class Main {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 3);
        matrix1.randomize();
        System.out.println("1я матрица:");
        matrix1.print();

        Matrix matrix2 = new Matrix(2, 3);
        matrix2.randomize();
        System.out.println("2я матрица:");
        matrix2.print();

        Matrix sumResult = matrix1.add(matrix2);
        System.out.println("Сумма матриц:");
        sumResult.print();

        Matrix scalarResult = matrix1.multiply(2.0);
        System.out.println("1я матрица умноженная на 2.5:");
        scalarResult.print();
    }
}
