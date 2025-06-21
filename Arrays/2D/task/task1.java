//sum of diagonals
class task1
{
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        int main_sum = 0;
        int sec_sum = 0;
        
        for(int i = 0 ; i < arr.length; i++)
        {
            main_sum = main_sum + arr[i][i];
            int n = arr.length;
            sec_sum = sec_sum + arr[i][n-i-1];
        }

        System.out.println("main diagonal sum "+ main_sum);
        System.out.println("sec diagonal sum "+ sec_sum);
    }
}