public class LinkedList {
  Node head;

  // Methods
  LinkedList() {
    this.head = null;
  }

  void addToTail(Node newNode) {
    if (head == null) {
      head = newNode;
    } else {
      // Find tail of linked list
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  void addToHead(Node newNode) {
    newNode.next = head;
    head = newNode;
  }

  void deleteTail() {
    if (head == null) {
      System.out.println("Linked list is empty");
      return;
    }
    if (head.next == null) {
      head = null;
      return;
    }
    Node temp1 = head;
    Node temp2 = null;
    while (temp1.next != null) {
      temp2 = temp1;
      temp1 = temp1.next;
    }
    temp2.next = null;
  }

  void deleteHead() {
    if (head == null) {
      System.out.println("Linked list is empty");
      return;
    }
    head = head.next;
  }

  void insert(int index, Node newNode) {
    if (index == 0) {
      addToHead(newNode);
      return;
    }
    if (index > this.getSize()) {
      System.out.println("Index out of bound");
      return;
    }
    Node temp1 = head;
    Node temp2 = null;
    for (int i = 0; i < index; i++) {
      temp2 = temp1;
      temp1 = temp1.next;
    }
    temp2.next = newNode;
    newNode.next = temp1;
  }

  // 1. Implement delete method on i-th index
  // 2. compare two linked list whether has the same data.

  int getSize() {
    Node temp = head;
    int size = 0;
    while (temp != null) {
      size++;
      temp = temp.next;
    }
    return size;
  }

  void print() {
    Node temp = head;
    while (temp != null) {
      if (temp.next == null) {
        System.out.print(temp.data);
      } else {
        System.out.print(temp.data + ",");
      }
      temp = temp.next;
    }
    System.out.println();
  }
}
