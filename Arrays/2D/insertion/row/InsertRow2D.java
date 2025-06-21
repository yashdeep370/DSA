public class InsertRow2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2},
            {3, 4}
        };

        int[] newRow = {5, 6};
        int insertIndex = 1;

        int[][] newArr = new int[arr.length + 1][arr[0].length];

        for (int i = 0, k = 0; i < newArr.length; i++) {
            if (i == insertIndex) {
                for (int j = 0; j < newRow.length; j++) {
                    newArr[i][j] = newRow[j];
                }
            } else {
                for (int j = 0; j < arr[0].length; j++) {
                    newArr[i][j] = arr[k][j];
                }
                k++;
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
