package org.example.algorithms.linkedlist;

public class CustomLinkedList {

  Node head;

  public void display() {
    Node current = head;

    while(current != null) {
      System.out.print(current.data + " -> ");
      current = current.next;
    }
    System.out.println();
  }

  public void delete() {

    if(head == null || head.next == null) {
      System.out.println("List is empty");
      return;
    }
    Node fast = head;
    Node previous = null;
    Node slow = head;
    while(fast != null && fast.next != null) {
      fast = fast.next.next;
      previous = slow;
      slow = slow.next;
    }
    previous.next = null;
  }
}
