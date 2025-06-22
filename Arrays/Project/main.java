//find no of days above avg temp

import java.util.Scanner;
class main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many days of temperature");
        int size = sc.nextInt();
        int arr [] = new int[size];
        int avg = 0;
        int temp =0;

        for(int i = 0 ; i<size; i++)
        {
            System.out.println("Day "+ (i+1)+ " high temp");
            arr[i] = sc.nextInt();
        } 
        for(int i = 0; i<arr.length; i++)
        {
            temp = (temp + arr[i]);
        }

        avg = temp/arr.length;
        System.out.println("Average " +avg);
        
        int count=0;
        for(int i = 0 ; i< size; i++)
        {
            if(arr[i] > avg)
            {
                count++; 
            }
        }
        System.out.println(count+" day(s) above average");

    }
}