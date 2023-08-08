package week01.exercise05.classes;

public class IdentityMatrix {

    private int number;
    private int rows = number;
    private int columns = number;

    private int[][] matrix;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int[][] createMatrix(int number) {
        int[][] matrix = new int[rows = number][columns = number];

        for (int i = 0; i < number; i++) {
            matrix[i][i] = number;
        }
        return matrix;
    }

    public void displayMatrix(int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int i2 = 0; i2 < columns; i2++) {
                System.out.print(" " + matrix[i][i2] + " ");
            }
            System.out.println();
        }
    }

    public void printMatrix(int number) {
        int[][] matrix = createMatrix(number);
        displayMatrix(matrix);
    }
}
