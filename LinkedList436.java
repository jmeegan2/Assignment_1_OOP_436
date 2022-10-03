public class LinkedList436 {

    private int counter;
    private Node head;

    // appends the specified element to the end of this list.
    // visible but its a method that has no return value
    public void add(Object data) {
        Node newNode = new Node(data);
    }
    // inserts the specified element at the specified position in this list
    // visible but its a method that has no return value
    public void add(Object data, int index) {


    }
    // returns the element at the specified position in this list.
    // visible that returns an element in specified position
    public Object get(int index)
    {



        return null;
    }

    // removes the element at the specified position in this list.
    // visible method to remove specific element at position
    public boolean remove(int index) {




        return false;
    }


    // returns the String content of all the nodes in this list.
    // visible method with return to show all the nodes in list
    public String toString() {



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

        }

// return the next node of the current node

        public Node getNext() {

            return next;

        }

        public void setNext(Node nextValue) {


        }

    }
    //////////////////////////////////////////////////////////////////////////////////////////////




}

