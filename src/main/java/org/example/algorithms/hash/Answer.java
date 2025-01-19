package org.example.algorithms.hash;// Java code​​​​​​‌‌​​​‌​‌​‌​‌‌​‌‌​‌​​​‌‌‌​ below
// Write your answer here, and then test your code.

import java.util.HashSet;

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
    }

    // Return true or false depending on if there's a 
    // cycle in the Linked List 
    static boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
      ListNode current = head;
        while(current != null){
          if(set.contains(current)){
            return true;
          }
            set.add(current);

          current = current.next;
        }
        return false;
    }

}
