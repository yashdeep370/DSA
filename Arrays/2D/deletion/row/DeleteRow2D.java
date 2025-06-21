public class DeleteRow2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2},
            {3, 4},
            {5, 6}
        };

        int deleteIndex = 1;

        int[][] newArr = new int[arr.length - 1][arr[0].length];

        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == deleteIndex) continue;

            for (int j = 0; j < arr[0].length; j++) {
                newArr[k][j] = arr[i][j];
            }
            k++;
        }

        // Print updated array
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[0].length; j++) {
                System.out.print(newArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
