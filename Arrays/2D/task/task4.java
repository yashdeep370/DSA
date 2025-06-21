//sum of cols

class task4
{
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        
        for(int i = 0; i < cols ; i ++)
        {
            int sum = 0;
            for(int j = 0; j< rows;j++)
            {
                sum = sum + arr[j][i];
            }
            System.out.println("sum of cols: " +sum);
        }
    }
}