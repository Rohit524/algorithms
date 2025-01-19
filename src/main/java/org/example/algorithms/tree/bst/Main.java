package org.example.algorithms.tree.bst;

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
    rootNode.data = 2;
  BinarySearchTree binaryTree = new BinarySearchTree();
    binaryTree.root = rootNode;

    binaryTree.insertIntoTree(3);
    binaryTree.insertIntoTree(5);
    binaryTree.insertIntoTree(1);
    binaryTree.insertIntoTree(100);

  }
}

