class main{
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 12;
        arr[4] = 14;

        int size = 5; // Current size of the array
        int value = 99; // Value to be inserted

        int index = 2;
        
        for(int i = size; i > index; i--){
            arr[i] = arr[i - 1];
        }

        arr[index] = value; // Insert the value at the specified index
        size++; // Increment the size of the array

        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}