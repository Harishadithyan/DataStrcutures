class Node:
    def __init__(self, value, next=None):
        self.value = value
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def insertfirst(self, value):
        node = Node(value)
        node.next = self.head
        self.head = node

        if self.tail is None:
            self.tail = self.head
        self.size += 1
    def insertlast(self, value):
        if self.tail is None:
            self.insertfirst(value)
            return
        node = Node(value)
        self.tail.next = node
        self.tail = node
        self.size += 1

    def delfirst(self):
        if self.head is None:
            print("Empty list")
            return -1

        val = self.head.value
        self.head = self.head.next
        self.size -= 1

        if self.head is None:
            self.tail = None

        return val
 
    def dellast(self):
        if self.size <= 1:
            return self.delfirst()

        second_last = self.head
        while second_last.next != self.tail:
            second_last = second_last.next

        val = self.tail.value
        self.tail = second_last
        self.tail.next = None
        self.size -= 1

        return val

    def insert_at_index(self, value, index):
        if index < 0 or index > self.size:
            print("Index out of bounds")
            return

        if index == 0:
            self.insertfirst(value)
            return

        if index == self.size:
            self.insertlast(value)
            return

        temp = self.head
        for _ in range(index - 1):
            temp = temp.next

        node = Node(value, temp.next)
        temp.next = node
        self.size += 1
    def delete_at_index(self, index):
        if index < 0 or index >= self.size:
            print("Index out of bounds")
            return -1

        if index == 0:
            return self.delfirst()

        if index == self.size - 1:
            return self.dellast()

        temp = self.head
        for _ in range(index - 1):
            temp = temp.next

        val = temp.next.value
        temp.next = temp.next.next
        self.size -= 1

        return val



    def display(self):
        temp = self.head
        while temp:
            print(temp.value, end=" -> ")
            temp = temp.next
        print("End")

ll = LinkedList()

ll.insertfirst(10)
ll.insertfirst(20)
ll.insertfirst(30)
ll.insertlast(100)
ll.insertlast(200)
ll.delete_at_index(1)
ll.insert_at_index(100,1)
ll.delfirst()
ll.dellast()
ll.display()
