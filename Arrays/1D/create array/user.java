import java.util.Scanner;
class user{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You have created an array of size " + size + " with the following elements:");
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}