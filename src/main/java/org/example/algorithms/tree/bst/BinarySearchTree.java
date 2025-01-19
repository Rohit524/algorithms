package org.example.algorithms.tree.bst;

public class BinarySearchTree {
  public Node root;

  public void insertIntoTree (int val) {
    insert(this.root, val);
  }

  private Node insert (Node root, int val) {
    if(root == null) {
      root = new Node();
      root.data = val;
    } else if(val < root.data) {
        root.left = insert(root.left, val);
    } else if(val > root.data) {
      root.right = insert(root.right, val);
    }
    return root;
  }
}
