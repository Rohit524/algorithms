package org.example.algorithms.string;

import java.util.Objects;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    System.out.println("checkAllUpperCase: "+checkAllUpperCase(""));
    System.out.println("checkAllLowerCase: "+checkAllLowerCase("ss"));
    System.out.println("checkDigitExist: "+checkDigitExist("22dw"));
    System.out.println("isComplexString: "+isComplexString("22dwW!"));
    System.out.println("containsSpecificChar: "+containsSpecificChar("A1adssaED#$RFDDSF!"));

    System.out.println("reverseString: "+reverseString("A1adssaED#$RFDDSF!"));
    System.out.println("reverseStringSB: "+reverseStringSB("A1adssaED#$RFDDSF!"));

    System.out.println("reverseWords: "+reverseWordsInSentence("racecar1 madam2"));

  }

  private static boolean checkAllUpperCase (String val) {
    boolean vv = val.chars().allMatch(Character::isUpperCase);
    char[] chars = val.trim().toCharArray();
    for(char c : chars) {
      if(!Character.isUpperCase(c)) {
        return false;
      }
    }
    return true;
  }

  private static boolean checkAllLowerCase (String val) {
    boolean vv = val.chars().noneMatch(Character::isUpperCase);
    char[] chars = val.trim().toCharArray();
    for(char c : chars) {
      if(!Character.isUpperCase(c)) {
        return false;
      }
    }
    return true;
  }

  private static boolean checkDigitExist (String val) {
    return val.chars().anyMatch(Character::isDigit);
  }

  private static boolean isComplexString (String val) {
    return val.chars().anyMatch(Character::isDigit) &&
        val.chars().anyMatch(Character::isUpperCase) && val.chars().anyMatch(Character::isLowerCase)
        && (val.chars().noneMatch(Character::isDigit) ||
        val.chars().noneMatch(Character::isUpperCase) || val.chars().noneMatch(Character::isLowerCase));
  }


  private static boolean containsSpecificChar (String val) {
    return val.trim().toLowerCase().replace(",","").chars().anyMatch(s -> Objects.equals(s, "97"));
  }

  private static String reverseString (String val) {
    char [] chars = val.trim().toCharArray();
    StringBuilder sb = new StringBuilder(chars.length);
    for(int i = chars.length - 1; i >= 0; i--) {
      sb.append(chars[i]);
    }
    return sb.toString();
  }

  private static String reverseStringSB (String val) {
    StringBuilder sb = new StringBuilder(val);
    return sb.reverse().toString();
  }

  private static String reverseWordsInSentence (String val) {
    String [] words = val.trim().split(" ");
    StringBuilder sb = new StringBuilder(words.length);
    for(String word: words) {
      sb.append(reverseStringSB(word));
      sb.append(' ');
    }
     sb.trimToSize();
    return sb.toString();
  }
}