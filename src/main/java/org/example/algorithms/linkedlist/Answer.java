package org.example.algorithms.linkedlist;// Java code​​​​​​‌‌​​​​‌‌‌‌‌​​‌‌‌‌​‌‌​‌‌‌​ below
// Write your answer here, and then test your code.
// Your job is to implement the sum() method.

class Answer {
    // Change these boolean values to control whether you see 
    // the expected result and/or hints.
    static boolean showExpectedResult = true;
    static boolean showHints = true;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
        
        @Override
        public String toString() {
            return Integer.toString(val);
        }
    }

    // Return the sum of the contents in the linked list
    static int sum(ListNode head) {
         if(head == null){
            return 0;
        }
        int val = 0;
        ListNode current = head;
        while(current != null){
            val += current.val ;
            current = current.next;
        }
         return val;
    }
    

}
