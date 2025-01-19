package org.example.algorithms.stack.queue;// Java code​​​​​​‌‌​​​‌​​‌​​‌​‌​​​​​‌​‌‌​‌ below
// Write your answer here, and then test your code.
// Your job is to implement the evaluateRPN() method.

import java.util.Stack;

class Answer {

    // Change these boolean values to control whether you see 
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    private static boolean isNumber(String token) {
        try {
            Double.parseDouble(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isOperator(String token) {
        return "+-*/".contains(token);
    }

    private static double performOperation(String operator, double operand1, double operand2) {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }

    // Return the result of the Reverse Polish notation expression
    static double evaluateRPN(String expression) {
        // Your code goes here.
        Stack<Double> stack = new Stack<>();
        String[] elements = expression.split(" ");

        for(int i = 0; i<elements.length ;i++){
            String nextVal = elements[i];
            if(isNumber(nextVal)){
                Double val = Double.parseDouble(nextVal);
                stack.push(val);
            } else if(isOperator(nextVal)){
                Double pop1 = stack.pop();
                Double pop2 = stack.pop();
                Double result = performOperation(nextVal,pop2, pop1);
                stack.push(result);
            }
        }

        return stack.pop();
    }

}
