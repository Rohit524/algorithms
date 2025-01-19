package org.example.algorithms.stack.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
    //printBinary();
    //findGreaterElement();
    //findGreaterElement1();
   // hasMatchingParenthesis("((algorithm()))");
    //hasMatchingParenthesis("()((algorithm))");
    //hasMatchingParenthesis("()((algorithm))())");
    String expression = "3 4 + 2 * 7 /";
    double result = Answer.evaluateRPN(expression);
    System.out.println("result: "+result);

  }

  private static void hasMatchingParenthesis (String expression) {
    Stack<Character> stack = new Stack<>();
    for(int i = 0; i < expression.length(); i++) {
      char ch = expression.charAt(i);
      if(ch == '(') {
        stack.push(ch);
      } else if(ch == ')' && !stack.isEmpty()) {
        stack.pop();
      }
    }

    if(!stack.isEmpty()) {
      System.out.println("Stack not empty: "+expression);
    } else {
      System.out.println("Stack empty: "+expression);
    }

  }

private static void findGreaterElement1 () {
  int[] vals = {16, 2, 7, 15};
  Stack<Integer> stack = new Stack<>();
  stack.push(vals[0]);
  for (int i = 1; i < vals.length; i++) {
    int nextVal = vals[i];
    if(!stack.isEmpty()) {
      int pop = stack.pop();
      while (pop < nextVal) {
        System.out.println(pop + " -->" + nextVal);
        if(stack.isEmpty()) {
          break;
        }
        pop = stack.pop();
      }
      if(pop > nextVal) {
        stack.push(pop);
      }
    }
    stack.push(nextVal);
  }
  while(!stack.isEmpty()) {
    System.out.println(stack.pop() + " --> -1");
  }
}

  private static void findGreaterElement () {
    int[] vals = {16,2,7,15};
    Stack<Integer> stack = new Stack<>();
    stack.push(vals[0]);
    for(int i = 1; i< vals.length; i++) {
      int next = vals[i];
      if(!stack.empty()){
        int pop = stack.pop();
        while(pop < next){
          System.out.println(pop + " --> " + next);
          if(stack.empty()){
            break;
          }
          pop = stack.pop();
        }
        if(pop > next){
          stack.push(pop);
        }
      }
      stack.push(next);
    }
    while(!stack.empty()){
      System.out.println(stack.pop() + "--> -1");
    }
  }

  private static void printBinary () {
    Stack<String> stack = new Stack<>();
    System.out.println("Begin main!");
    stack.push("main");
    System.out.println("Begin builder!");
    stack.push("builder");
    System.out.println("Begin external-service!");
    stack.push("external-service");
    System.out.println("Peek "+stack.peek());
    System.out.println("END "+stack.pop());
    System.out.println("Begin parse-external-service!");
    stack.push("parse-external-service");
    System.out.println("END "+stack.pop());
    System.out.println("Peek1 "+stack.peek());
    System.out.println("END "+stack.pop());
    System.out.println("END "+stack.pop());
  }

 }