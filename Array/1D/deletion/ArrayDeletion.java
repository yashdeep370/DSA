public class ArrayDeletion {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int size = 4;

        // Initial values
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;

        int deleteValue = 10;
        int deleteIndex = -1;

        // Step 1: Search for the value to delete
        for(int i = 0; i < size ; i++){
            if(arr[i] == deleteValue)
            {
                deleteIndex = i;
                break;
            }
        }

        if(deleteIndex == -1){
            System.out.println("not found");
        }
        else{
            for(int i = deleteIndex; i <size -1 ; i++)
            {
                arr[i] = arr[i+1];
            }
            size--;

            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
                
            }
        }
    }
}