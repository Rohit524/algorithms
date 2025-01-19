package org.example.algorithms.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class HashSetMain {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Empolyee emp1 = new Empolyee("Rohit", 1, "Digital Developer");
    Empolyee emp2 = new Empolyee("Sarfraz", 2, "Digital QA");
    Empolyee emp3 = new Empolyee("Ipsita", 3, "Digital Analyst");

    HashSet<String> hashSet = new HashSet<>();
    hashSet.add(emp1.name);
    hashSet.add(emp2.name);

    System.out.println("Hashset: " + hashSet.contains(emp1.name));
    System.out.println("Hashset: " + hashSet.contains(emp3.name));

    int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] arr2 = new int[]{1, 3, 4, 5, 7, 9, 10};
    List<Integer> returnDiff = findMissingElement(arr1, arr2);
    System.out.println(returnDiff);
  }

  private static List<Integer> findMissingElement (int[] arr1, int[] arr2) {
    List<Integer> returnElements = new ArrayList<>();
    HashSet<Integer> hashSet = new HashSet<>();
    for (int i : arr2) {
      hashSet.add(i);
    }
    for (int i : arr1) {
      if(!hashSet.contains(i)) {
        returnElements.add(i);
      }
    }
    return returnElements;
  }



}