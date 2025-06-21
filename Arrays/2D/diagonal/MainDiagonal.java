public class MainDiagonal {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Main diagonal elements:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
        }
    }
}
