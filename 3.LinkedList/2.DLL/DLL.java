public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    // Insert at beginning
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        } else {
            tail = node;
        }

        head = node;
        size++;
    }
    public void insertLast(int val) {
    Node node = new Node(val);

    if (tail == null) { 
        head = node;
        tail = node;
        node.prev = null;
    } else {
        tail.next = node;
        node.prev = tail;
        tail = node;
    }

    tail.next = null;
    size++;
}
    public void insertslast(int val){
        Node node=new Node(val);
        Node last=head;
        if(head == null){
            node.prev=null;
            head=node;
            return;
        }
        while(last.next != null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
    }
    // Display forward
    public void insertAt(int val, int index) {
    if (index < 0 || index > size) {
        System.out.println("Index out of bounds");
        return;
    }

    if (index == 0) {
        insertFirst(val);
        return;
    }

    if (index == size) {
        insertLast(val);
        return;
    }

    // Insert in the middle
    Node temp = head;
    for (int i = 0; i < index - 1; i++) {
        temp = temp.next; // move to node before the insertion point
    }

    Node node = new Node(val, temp.next, temp); // new node points next to temp.next and prev to temp
    temp.next.prev = node; // update prev of the next node
    temp.next = node;       // link previous node to new node
    size++;
}

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void displayrev() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.println("End");
    }

    // Node class
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
