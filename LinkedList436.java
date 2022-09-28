public class LinkedList436 {
    private int counter;
    private Node head;

    // appends the specified element to the end of this list.
    public void add(Object data) {

        // PLEASE ADD YOUR CODE HERE.
    }
    // inserts the specified element at the specified position in this list
    public void add(Object data, int index) {

        // PLEASE ADD YOUR CODE HERE.
    }
    // returns the element at the specified position in this list.
    public Object get(int index)
    {
        // PLEASE ADD YOUR CODE HERE.


        return null;
    }

    // removes the element at the specified position in this list.
    public boolean remove(int index) {

        // PLEASE ADD YOUR CODE HERE.


        return false;
    }


    // returns the String content of all the nodes in this list.
    public String toString() {

        // PLEASE ADD YOUR CODE HERE.


        return null;
    }

    // returns the number of elements in this list.
    public int size() {
        return counter;
    }

    // Inner Class Node implemented below                                                       //
    //////////////////////////////////////////////////////////////////////////////////////////////
    private class Node {

        // reference to the next node in the chain, or null if there isn't one.
        Node next;



// data carried by this node. could be of any type you need.
        Object data;

// Node constructor
        public Node(Object dataValue) {

        }

// these methods should be self-explanatory

        public Object getData() {
            return data;
        }

        public void setData(Object dataValue) {
// PLEASE INPLEMENT YOUR CODE HERE
        }

// return the next node of the current node

        public Node getNext() {

            return next;

        }

        public void setNext(Node nextValue) {

// PLEASE ImPLEMENT YOUR CODE HERE

        }

    }
    //////////////////////////////////////////////////////////////////////////////////////////////
}