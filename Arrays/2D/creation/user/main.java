
import java.util.Scanner;

class main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows:");
        int rows = sc.nextInt();
        
        System.out.println("Enter columns:");
        int cols = sc.nextInt();

        System.out.println("No of rows " +rows+ " No of columns " +cols);
        int arr[][] = new int[rows][cols];

        System.out.println("Enter total " +rows*cols+ " elements");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols ; j++){
                arr[i][j] = sc.nextInt();
            }
        }



        System.out.println("Printing the array");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols ; j++){
                System.out.print(arr[i][j] +" ");
            }
        }
    }
}