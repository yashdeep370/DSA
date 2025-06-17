class main{
    public static void main(String[] args) {
        int oldarr[] = {1, 2, 3, 12, 14};
        int size = oldarr.length;
        int value = 99;

        int newarr [] = new int[size + 1];

        for (int i = 0; i < size; i++) {
            newarr[i] = oldarr[i];
            
        }

        newarr[size] = value;
        size++;

        for (int i = 0; i < size; i++) {
         
            System.out.println(newarr[i]);
        }
    }
}