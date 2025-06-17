class main {
    public static void main(String[] args) {
        int [] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 12;
        arr[4] = 14;

        int size = 5;
        int value = 99;
        // Insertion in the end of the array

        arr [size] = value;
        size++;


        // System.out.println("Array elements:" + arr[0] + ", " + arr[1] + ", " + arr[2]);\
        for(int i = 0; i < size; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
