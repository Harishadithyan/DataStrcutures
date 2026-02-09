class Node:
    def __init__(self, value):
        self.value = value
        self.next = None
        self.prev = None

class Main:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    def insertFirst(self, val):
        node = Node(val)
        node.next = self.head
        node.prev = None

        if self.head is None:  
            self.tail = node
        else:
            self.head.prev = node

        self.head = node
        self.size += 1

    def display(self):
        temp = self.head
        while temp is not None:
            print(str(temp.value) + "<->", end="")
            temp = temp.next
        print("END")
    
    def displayrev(self):
        temp=self.tail
        while temp is not None:
            print(str(temp.value)+"<->",end=" ")
            temp=temp.prev
        print("Start")
    
    def deleteFirst(self):
        if self.head is None: 
            print("List is empty, nothing to delete.")
            return
        self.head = self.head.next
        if self.head is not None:
            self.head.prev = None
        else:
            self.tail = None

        self.size -= 1
    def deleteLast(self):
        if self.head is None:
            print("List is empty")
            return
        self.tail=self.tail.prev
        if self.head is not None:
            self.tail.next=None
        else:
            self.tail=None
        self.size-=1



my_list = Main()
my_list.insertFirst(50)
my_list.insertFirst(80)
my_list.insertFirst(90)
my_list.insertFirst(100)
my_list.display()
my_list.deleteLast()
my_list.display()
my_list.displayrev()

