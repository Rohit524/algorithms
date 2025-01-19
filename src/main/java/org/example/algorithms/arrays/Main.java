package org.example.algorithms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    int arr[] = {1,2,3,4,5};
    //linearSearch time complexity O(N)
    System.out.println("linearSearch: "+linearSearch(arr,1));
    System.out.println("linearSearch: "+linearSearch(arr,8));
    System.out.println("linearSearchJ8: "+linearSearchJ8(arr,1));
    System.out.println("linearSearchJ8: "+linearSearchJ8(arr,8));

    //binarySearch time complexity O(log(N))
    int arrB[] = {4,23,33,34,50,88,89,95};
    System.out.println("binarySearch: "+binarySearch(arrB,1));
    System.out.println("binarySearch1: "+binarySearch(arrB,8));
    System.out.println("binarySearchJ8: "+binarySearchJ8(arrB,8));
    System.out.println("binarySearchJ8_1: "+binarySearchJ8(arrB,1));

    int arrNeg[] = {-4,23,33,-34,50,88,-89,95};
    System.out.println("findEvenNumbers:");
    Arrays.stream(findEvenNumbers(arrB,arrB,arrNeg)).forEach(System.out::print);
    System.out.println();
    System.out.println("findEvenNumbersJ8: ");
    Arrays.stream(findEvenNumbersJ8(arrB,arrB,arrNeg)).forEach(System.out::print);
    System.out.println();
    System.out.println("reverseArray:");
    Arrays.stream(reverseArray(arrB)).forEach(System.out::println);
    Arrays.stream(reverseArray(arrB)).forEach(System.out::println);

    System.out.println("reverseArray1:");
    int reverseArray[] = {1,2,3,4,5,6};
    reverseArray1(reverseArray);
    reverseArray1(reverseArray);
    Arrays.stream(reverseArray).forEach(System.out::println);

    System.out.println("rotateArray:");
    int rotateArray[] = {1,2,3,4,5,6};
    int res[] = rotateArray(rotateArray);
    Arrays.stream(res).forEach(System.out::println);


  }

  private static Integer linearSearch (int[] arr, int val) {
    for(int i : arr){
      if(i == val){
        return i;
      }
    }
    return null;
  }


  private static OptionalInt linearSearchJ8 (int[] arr, int val) {
    Arrays.stream(arr).filter(value -> value == val).findFirst().ifPresent(value -> {System.out.println(value);});
    return Arrays.stream(arr).filter(i -> i == val).findFirst();
  }

  private static boolean binarySearch (int[] arr, int val) {
    int min = 0;
    int max = arr.length - 1;

    while(min <= max){
      int mid = (max + min)/2;
      if(arr[mid] == val){
        return true;
      } else if(arr[mid] < val){
        max = mid - 1;
      } else {
        min = mid + 1;
      }
    }
    return false;
  }

  private static int binarySearchJ8 (int[] arr, int val) {
    return Arrays.binarySearch(arr, val);
  }


  private static int[] findEvenNumbers (int[] arr, int[] arrB, int[] arrNeg) {
    ArrayList<Integer> result = new ArrayList<>();
    iterateOverArray(arr, result);
    iterateOverArray(arrB, result);
    iterateOverArray(arrNeg, result);

    return  result.stream().mapToInt(i -> i).toArray();
  }


  private static int[] findEvenNumbersJ8 (int[] arr, int[] arrB, int[] arrNeg) {
    IntPredicate predicate = n -> n%2 == 0;
    return Stream.of(arr, arrB, arrNeg).flatMapToInt(Arrays::stream).filter(predicate).toArray();
  }

  private static void iterateOverArray(int[] arr, ArrayList<Integer> result) {
    for(int i : arr){
      if(i%2 == 0){
        result.add(i);
      }
    }
  }


  private static int[] reverseArray (int[] arr) {
    int[] arrResult = new int[arr.length];
    for(int i=0; i<arr.length; i++){
      arrResult[i] = arr[arr.length-1-i];
    }
    return arrResult;
  }


  private static void reverseArray1 (int[] arr) {
    for(int i=0; i<arr.length/2; i++){
      int temp = arr[i];
      arr[i] = arr[arr.length-i-1];
      arr[arr.length-i-1] = temp;
    }}

  private static int[] rotateArray(int[] numbers) {
    // Your code goes here.
    //[1, 2, 3, 4, 5, 6]
    //[2, 3, 4, 5, 6, 1]
    int[] result = new int[numbers.length];

    for(int i = 1; i<numbers.length; i++){
      result[i-1]=numbers[i];
    }
    result[numbers.length-1]=numbers[0];
    return result;
  }
}