import java.util.*;

class Array_list{
    public static void main(String[] args){
        ArrayList <Integer> array= new ArrayList<>();
        // Adding the elements in the array
        array.add(10);
        array.add(20); 
        array.add(30); 
        array.add(40); 
        array.add(50); 
        System.out.println(array);
        // removing the elements in the arrays
        array.remove(4);
        // Updating the elements
        array.set(1,200);
        System.out.println(array);
    }
}