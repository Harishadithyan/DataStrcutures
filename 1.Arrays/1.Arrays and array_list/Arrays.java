public class Arrays {
    public static void main(String[] args) {
        int[] arrays={10,20,30};
        // Traverse the arrays
        for (int i=0;i<arrays.length;i++){
            System.out.println(arrays[i]);
        }
        String[] arrays1={"Hello","Everyone","Good morning"};
        for (int i=0;i<arrays.length;i++){
            System.out.println(arrays1[i]);
        }
        // Accessing elements
        System.out.println(arrays[0]);
        // Updating the elements
        arrays[2]=100;
        System.out.println(arrays[2]);
    }
}
