public class DeleteColumn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int deleteIndex = 1;

        int rows = arr.length;
        int cols = arr[0].length;

        int[][] newArr = new int[rows][cols - 1];

        for (int i = 0; i < rows; i++) {
            for (int j = 0, k = 0; j < cols; j++) {
                if (j == deleteIndex) continue;

                newArr[i][k] = arr[i][j];
                k++;
            }
        }

        // Print updated matrix
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
