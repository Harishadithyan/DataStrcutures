public class Remove {
    public static void main(String[] args) {

        ll list = new ll();

        list.insertFirst(1);
        list.insertFirst(1);
        list.insertLast(2);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
       
        list.display();
           // 10 -> 30 -> End
        list.dulicate();
        list.display();
    }
}
