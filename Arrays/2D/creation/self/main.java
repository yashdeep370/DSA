class main{
    public static void main(String[] args) {
        int arr[][]= new int[2][2];

        arr[0][0] = 10;                       
        arr[0][1] = 20;                       
        arr[1][0] = 30;                       
        arr[1][1] = 40;                       
        
        System.out.println("Printing array");

        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr.length; j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}