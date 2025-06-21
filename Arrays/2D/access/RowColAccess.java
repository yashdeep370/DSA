public class RowColAccess {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        // Print 2nd row (index 1)
        System.out.print("Last row: ");
        for (int j = 0; j < arr[2].length; j++) {
            System.out.print(arr[2][j] + " ");
        }

        System.out.println();

        // Print 1st column (index 0)
        System.out.print("Middle column: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][1] + " ");
        }
    }
}
