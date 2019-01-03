package com.bridgelabz.datastructuresprograms;

class BinarySearchTree { 
    Node root; 

    BinarySearchTree() {  
        root = null;  
    } 

    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
 
    Node insertRec(Node root, int key) { 
  
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
        {
            root.left = insertRec(root.left, key); 
        System.out.println("root left :"+root);
        }
        else if (key > root.key) 
        {
            root.right = insertRec(root.right, key); 
            System.out.println("root right :"+root);
        }
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  

    void inorder()  { 
       inorderRec(root); 
    } 
  
  
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.println(root.key); 
            inorderRec(root.right); 
        } 
    } 
  
    // Driver Program to test above functions 
    public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 

        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(90); 
        tree.insert(60); 
        tree.insert(80); 
        tree.insert(12);
        tree.inorder(); 
    } 
} 
class Node { 
    int key; 
    Node left, right; 

    public Node(int item) { 
        key = item; 
        left = right = null; 
    } 
} 