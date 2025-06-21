//sum of rows

class task3
{
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        
        for(int i = 0; i < rows ; i ++)
        {
            int sum = 0;
            for(int j = 0; j< cols;j++)
            {
                sum = sum + arr[i][j];
            }
            System.out.println("sum of rows: " +sum);
        }
    }
}