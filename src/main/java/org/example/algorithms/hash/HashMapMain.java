package org.example.algorithms.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class HashMapMain {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    int[] arr1 = new int[]{ 2, 3, 4, 5, 6, 7, 8, 9,1, 2, 3, 5, 6, 7, 8, 9,1, 2, 3, 5, 6, 7, 8, 9, 10,
        1, 2, 3, 4, 5, 6, 7, 8, 9};

    Map<Integer, Integer> returnDiff = findCount(arr1);
    returnDiff.forEach((k, v) -> System.out.println(k + ": " + v));
  }

  private static Map<Integer, Integer> findCount (int[] arr1) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i : arr1) {
      if(!map.containsKey(i)) {
        map.put(i, 1);
      } else {
        map.put(i, map.get(i) + 1);
      }
    }
    return map;
  }



}