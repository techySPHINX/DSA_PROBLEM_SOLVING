
public class TransPose_in_Place {

  public static void transpose(int[][] matrix) {
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        // Swap elements only if they are not already in their transposed positions
        if (i != j) {
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
        }
      }
    }
  }

  public static void printMatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };

    System.out.println("Original Matrix:");
    printMatrix(matrix);

    transpose(matrix);

    System.out.println("Transposed Matrix:");
    printMatrix(matrix);
  }
}
