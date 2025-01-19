package org.example.algorithms.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Empolyee emp1 = new Empolyee("Rohit", 1, "Digital Developer");
    Empolyee emp2 = new Empolyee("Sarfraz", 2, "Digital QA");
    Empolyee emp3 = new Empolyee("Ipsita", 3, "Digital Analyst");

    HashMap<Integer, Empolyee> empolyeeHashMap = new HashMap<>();
    empolyeeHashMap.put(emp1.id, emp1);
    empolyeeHashMap.put(emp2.id, emp2);
    empolyeeHashMap.put(emp3.id, emp3);

    Empolyee empolyee = empolyeeHashMap.get(2);
    if (empolyee != null) {
      System.out.println("Employee name: "+ empolyee.name+", employee department: "+ empolyee.department);
    }

    HashSet<String> hashSet = new HashSet<>();
    hashSet.add(emp1.name);
    hashSet.add(emp2.name);

    System.out.println("Hashset: " + hashSet.contains(emp1.name));
    System.out.println("Hashset: " + hashSet.contains(emp3.name));

    Answer answer = new Answer();
    Answer.ListNode head = answer.new ListNode(1);
    head.next = answer.new ListNode(2);
    head.next.next = answer.new ListNode(3);
    head.next.next.next = head;
    //System.out.println("result: " + Answer.hasCycle(head));


    Answer answer1 = new Answer();
    Answer.ListNode head1 = answer1.new ListNode(3);
    head1.next = answer1.new ListNode(3);
    head1.next.next = answer1.new ListNode(1);
    System.out.println("result: " + Answer.hasCycle(head1));
  }

  private static Integer linearSearch (int[] arr, int val) {
    for(int i : arr){
      if(i == val){
        return i;
      }
    }
    return null;
  }



}