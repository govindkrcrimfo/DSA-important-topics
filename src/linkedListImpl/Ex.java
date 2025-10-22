package linkedListImpl;

/*
 * Linked list implementation
 */
class Node {
  int val;
  Node next;

  Node(int val) {
    this.val = val;
    this.next = null;
  }
}

class LinkedList {
  Node head;
  int size = 0;

  void add(int element) {
    Node n = new Node(element);
    if (head == null) {
      size++;
      head = n;
      return;
    }
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
    }
    temp.next = n;
    size++;
  }

  int delelet() {
    Node temp = head;
    if (temp == null) {
      temp = null;
      size = 0;
      return -1;
    }
    if (temp.next == null) {
      int deletedNodeValue = temp.val;
      head = null;
      size = 0;
      return deletedNodeValue;
    }
    while (temp.next.next != null) {
      temp = temp.next;
    }
    int deletedNodeValue = temp.next.val;
    temp.next = null;
    size--;
    return deletedNodeValue;

  }

  void printLinkedList() {
    Node temp = head;
    while (temp != null) {
      System.out.print("  " + temp.val);
      temp = temp.next;
    }
    System.out.println();
  }

  int size() {
    return size;
  }
}

public class Ex {
  public static void main(String args[]) {
    LinkedList l = new LinkedList();
    l.add(10);
    l.add(20);
    l.add(30);
    l.add(40);
    l.printLinkedList();
    System.out.println("size of linkedlist " + l.size());
    System.out.println("deleted value " + l.delelet());
    l.printLinkedList();
    System.out.println("size of linkedlist " + l.size());
    System.out.println("deleted value " + l.delelet());
    System.out.println("deleted value " + l.delelet());
    System.out.println("size of linkedlist " + l.size());
    System.out.println("deleted value " + l.delelet());
    System.out.println("size of linkedlist " + l.size());
    System.out.println("deleted value " + l.delelet());
    System.out.println("Linked list is empty");
    l.add(5);
    l.add(2);
    l.printLinkedList();
    System.out.println("size of linkedlist " + l.size());
    System.out.println("deleted value " + l.delelet());
    System.out.println("size of linkedlist " + l.size());

  }
}
