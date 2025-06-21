public class SecondaryDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Secondary diagonal elements:");

        int n = arr.length; // assuming square matrix
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][n - i - 1]);
        }
    }
}
