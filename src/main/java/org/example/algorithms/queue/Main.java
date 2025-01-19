package org.example.algorithms.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Queue<Integer> queue = new LinkedList<>();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);

    int remove = queue.remove();
    System.out.println(remove);
    System.out.println(queue.remove());
    System.out.println(queue.peek());

    while (!queue.isEmpty()) {
      System.out.println(queue.remove());
    }

    printBinary(100);

  }

  private static void printBinary (int val) {
    if(val < 0) {
      System.out.println();
      return;
    }
  Queue<Integer> queue = new LinkedList<>();
    queue.add(1);

    for(int i = 0; i < val; i++) {
      int current = queue.remove();
      System.out.println(i+1 +" -->> "+current);
      queue.add(current*10);
      queue.add(current*10+1);
    }
    System.out.println();
  }

 }