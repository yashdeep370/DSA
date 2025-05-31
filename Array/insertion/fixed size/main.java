class main {
    public static void main(String[] args) {
        int arr[] =  new int[10];
        int size = 5;
        arr[0] = 10;
        arr[1] = 20;    
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int index = 3;
        int value = 90;

        for(int i =size; i> index; i--)
        {
            arr[i] = arr[i-1];
        }

        arr[index] = value;
        size++;
        System.out.print("Array elements after insertion: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
}
