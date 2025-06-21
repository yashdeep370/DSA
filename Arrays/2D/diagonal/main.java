public class main {
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        System.out.println("Secondary diagonal elements:");

        System.out.println(arr[0][2]); 
        System.out.println(arr[1][1]);   
        System.out.println(arr[2][0]); 
    }
}
