import edu.princeton.cs.algs4.StdOut;

import java.util.NoSuchElementException;
import java.util.Queue;

public class BST <Key extends Comparable<Key>, Value>{

    // internal private Node class that will have a key and point to a left and right node
    private class Node {
        public Key key;
        public Value value;
        public Node left;
        public Node right;

        // constructor
        public Node(Key key, Value value){
            this.key = key;
            this.value = value;
        }
    }

    // our starting point for our BST
    Node root;

    public BST(){
        // root starts off empty
        root = null;
    }

    // calls the private put method, and it just needs to know what to put in BST and the root of where to begin
    public void put(Key key, Value value){
        root = put(key, value, root);
    }

    private Node put(Key key, Value value, Node n){
        if (n == null){
            return new Node(key, value);
        }
        int cmp = key.compareTo(n.key);
        if(cmp < 0){
            n.left = put(key, value, n.left);
        } else if (cmp > 0) {
            n.right = put(key, value, n.right);
        }
        else {
            n.value = value;
        }
        return n;
    }

    public void inorder(){
        inorder(root);
    }

    // prints
    private void inorder(Node n){
        if(n == null){
            return;
        }
        inorder(n.left);
        StdOut.println(n.key + " ");
        inorder(n.right);
    }

    public boolean contains(Key k){

    }

    // reach into the BST and grab the value that is associated with a given key
    public Value get(Key k){

    }

    // create a Queue that contains all of the keys
    public Queue<Key> keys(){

    }

    // delete  akey from the tree
    public void del(Key k){

    }

    public static void main(String[] args){
        // creates a new BST, and what it has is root of null
        BST<String, Integer> tree = new BST<>();
        tree.put("D", 10);
        tree.put("E", 5);
        tree.put("A", 20);
        tree.inorder();

        BST<Point, Integer> tree2 = new BST<>();
        Point p = new Point();
        tree2.put(p, 10);
    }
}
