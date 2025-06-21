class main{
    public static void main(String[] args) {
        int[][] arr = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int rows = arr.length;
        int cols = arr[0].length;
        int transpose[][] = new int[rows][cols];

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr[i].length; j++)
            {
                transpose[j][i] = arr[i][j];
            }
        }

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0 ; j < arr[i].length; j++)
            {
                System.out.print(transpose[i][j]);
            }
            System.out.println("");
        }
    }
}