//search

class task2
{
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        int seachValue = 90;

        boolean found = false;

        int rows = arr.length;
        int cols = arr[0].length;
        for(int i = 0 ; i < rows; i++)
        {
            for(int j = 0 ; j < cols; j++)
            {
                if(arr[i][j]==seachValue)
                {
                    System.out.println("Item found at: " + i + " " + j);
                    found = true;
                    break;
                }
            }
            if(found) {
                break;
            }
        }
        if(!found) {
            System.out.println("Item not found");
        }
    }
}