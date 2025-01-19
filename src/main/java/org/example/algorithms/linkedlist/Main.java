package org.example.algorithms.linkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    linkedList();
  CustomLinkedList list = new CustomLinkedList();
  Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);
    Node node4 = new Node(4);
    list.head = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    list.display();
    list.delete();
    list.display();
    CustomLinkedList list1 = new CustomLinkedList();
    list1.delete();
    list1.display();

    Answer answer = new Answer();
    Answer.ListNode head = answer.new ListNode(3);

    int result = Answer.sum(head);
    System.out.println(result);
  }

  private static void linkedList () {
    LinkedList<String> list = new LinkedList<>();
    List<String> list1 = new ArrayList<>();

    list.add("Rohit");
    list.addFirst("Hello");
    list.addLast("Chelluri");
    System.out.println(list);

    list1.add("Rohit");
    list1.add("Hello");
    list1.add("Chelluri");
    System.out.println(list1);
  }
}