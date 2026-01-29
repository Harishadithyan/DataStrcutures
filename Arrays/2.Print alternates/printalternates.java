import java.util.*;

class printalternates{
    public static void main(String[] args){
        int[] arr={10,20,30,40};
        ArrayList <Integer> a1= new ArrayList<>();
        for (int i=0;i<arr.length;i+=2){
                a1.add(arr[i]);
        }
        System.out.println(a1);
    }
}