import java.util.*;

class Node {
    int key;
    Node left, right;
    
    Node(int item) {
        key = item;
        left = right = null;
    }
}

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
        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if(key >= root.key){// allows duplicates go to right
            root.right = insertRec(root.right, key);
        }
        return root;
    }
    
    void delete(int key) {
        root = deleteRec(root, key);
    }

    Node deleteRec(Node root, int key) {
        if (root == null) return root;

        if (key < root.key) {
            root.left = deleteRec(root.left, key);
        } else if (key > root.key) {
            root.right = deleteRec(root.right, key);
        } else {
            // found the node to delete
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }

    boolean search(int key) {
        return searchRec(root, key);
    }

    boolean searchRec(Node root, int key) {
        if (root == null) return false;
        if (root.key == key) return true;
        if (root.key < key) return searchRec(root.right, key);
        else return searchRec(root.left, key);
    }

    void inorder() {
        inorderRec(root);
        System.out.println();
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }

    void preorder() {
        preorderRec(root);
        System.out.println();
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.key + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    void postorder() {
        postorderRec(root);
        System.out.println();
    }

    void postorderRec(Node root) {
        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.key + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree b = new BinarySearchTree();
        b.insert(10);
        b.insert(9);
        b.insert(11);  
        b.insert(17);  
        b.insert(4);  
        b.insert(7);  
        b.insert(13);  
        b.insert(15);
        b.insert(10);
        b.insert(6);
        
        b.inorder();
        System.out.println(b.search(4));

        b.preorder();
        System.out.println(b.search(14));

        b.postorder();
        b.delete(6);

        b.inorder();
    }
}
