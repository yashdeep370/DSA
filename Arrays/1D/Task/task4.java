//deletion

class task4{
    public static void main(String[] args) {
        int[] arr = {3, 6, 9, 12, 15};
        int size = 5;
        int deleteValue = 9;
        int deleteIndex = -1;

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==deleteValue){
                deleteIndex = i;
                break;
            }
        }

        if(deleteIndex==-1){
            System.out.println("not found");
        }
        else{
            for(int i = deleteIndex; i < size -1; i++)
            {
                arr[i] = arr[i+1];
            }
            size--;

            for(int i = 0; i < size; i++){
                System.out.println(arr[i]);
            }
        }
    }
}