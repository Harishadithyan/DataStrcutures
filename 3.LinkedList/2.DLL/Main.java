class Main{
    public static void main(String[] args){
        DLL list=new DLL();
        list.insertFirst(40);
        list.insertFirst(50);
        list.insertFirst(60);
        list.insertFirst(70);
        list.insertLast(20);
        list.insertLast(30);
        list.insertslast(99);
        list.insertAt(100,4);
        list.display();
        list.displayrev();
    }
}