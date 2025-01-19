package org.example.algorithms.tree.bs;

/**
 *                  5
 *          2                7
 *    8         11
 *
 * Pre Order: 5, 2, 8, 11, 7 (Root to left then right, Explore roots before leaves)
 * In order: 8, 2, 11, 5, 7 ( Left to root to right recursively, explore leaves before root)
 * Post Order: 8, 11, 2, 7, 5 (Left, Right then root last, explore data sequentially)
 *
 *
 * */

//BS is for non linear data
public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");
  Node rootNode = new Node();
    rootNode.data = 5;
    Node rootNode2 = new Node();
    rootNode2.data = 2;
    Node rootNode4 = new Node();
    rootNode4.data = 4;
    Node rootNode9 = new Node();
    rootNode9.data = 9;
    Node rootNode10 = new Node();
    rootNode10.data = 10;
    Node rootNode7 = new Node();
    rootNode7.data = 7;

    rootNode.left = rootNode2;
    rootNode.right = rootNode4;
    rootNode2.left = rootNode9;
    rootNode2.right = rootNode10;
    rootNode4.left = rootNode7;

    BinaryTree binaryTree = new BinaryTree();
    binaryTree.root = rootNode;

    binaryTree.preOrderTraversal();
    System.out.println("End preOrderTraversal!");
    binaryTree.inOrderTraversal();
    System.out.println("End inOrderTraversal!");
    binaryTree.postOrderTraversal();
    System.out.println("End postOrderTraversal!");


  }
}

