package org.example.algorithms.tree.bs;// Java code​​​​​​‌‌​​​‌​‌​‌‌‌​‌‌‌​​​​‌‌‌​​ below
// Write your answer here, and then test your code.
// Your job is to implement the findHeight() method.
//
//             10
//     5                   15
// 3       7  

class Answer {
    // Change these boolean values to control whether you see 
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;
    
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;


        TreeNode(int val) {
            this.val = val;
        }
    }

    // Return the maximum depth of the binary tree
    static int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = findHeight(root.left);
            int rightHeight = findHeight(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
        Answer answer = new Answer();
        Answer.TreeNode root = answer.new TreeNode(10);
        root.left = answer.new TreeNode(5);
        root.right = answer.new TreeNode(15);
/*        root.left.left = answer.new TreeNode(3);
        root.left.right = answer.new TreeNode(7);*/

        int result = Answer.findHeight(root);
        System.out.println("result: "+ result);


    }

}
  