public class InsertColumn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2},
            {3, 4}
        };

        int[] newCol = {9, 8};      // New column values
        int insertIndex = 1;        // Column index to insert at

        int rows = arr.length;
        int cols = arr[0].length;

        int[][] newArr = new int[rows][cols + 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0, k = 0; j < newArr[0].length; j++) {
                if (j == insertIndex) {
                    newArr[i][j] = newCol[i]; // Insert new column value
                } else {
                    newArr[i][j] = arr[i][k];
                    k++; // Advance original column index
                }
            }
        }

        // Print new matrix
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
