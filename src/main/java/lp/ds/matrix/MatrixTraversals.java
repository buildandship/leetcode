package lp.ds.matrix;

public class MatrixTraversals {

  public static void main(String[] args) {
    int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    rowMajorTraversal(matrix);
    columnMajorTraversal(matrix);
  }

  static void rowMajorTraversal(int matrix[][]) {
    for (int row = 0; row < matrix.length; row++) {
      for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(" " + matrix[row][col]);
        // System.out.print(" "+matrix[col][row]);

      }
    }
    System.out.println("\n Done Row Major Traversal");
  }

  static void columnMajorTraversal(int matrix[][]) {
    for (int col = 0; col < matrix[0].length; col++) {
      for (int row = 0; row < matrix.length; row++) {
        System.out.print(" " + matrix[row][col]);
      }
    }
    System.out.println("\n Done Column Major Traversal");
  }
}
