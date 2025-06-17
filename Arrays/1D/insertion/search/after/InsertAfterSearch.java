public class InsertAfterSearch {
    public static void main(String[] args) {
        int[] arr = new int[10]; // Extra space for insertion
        int size = 4;

        // Step 1: Initial elements
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        arr[3] = 20;

        int searchValue = 10;
        int newValue = 99;
        int insertIndex = -1;

        // Step 2: Search for the value
        for (int i = 0; i < size; i++) {
            if (arr[i] == searchValue) {
                insertIndex = i + 1;  // Insert after the found index
                break;
            }
        }

        if (insertIndex == -1) {
            System.out.println("Value not found in array.");
        } else {
            // Step 3: Shift elements to the right
            for (int i = size; i > insertIndex; i--) {
                arr[i] = arr[i - 1];
            }

            // Step 4: Insert new value
            arr[insertIndex] = newValue;
            size++;

            // Step 5: Print updated array
            System.out.println("Updated Array:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
