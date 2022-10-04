public class LinkedList436 {
    private int counter;
    private Node head;
    private Node last;

    // adds the specific element to the end of the list
    public void add(Object data) {

        Node newNode;
        newNode = new Node(data); // new Node created

        if (head == null) {
            head = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        counter++;
    }

    // inserts the specified element at the specific position in this list
    public void add(Object data, int index) {

        Node newNode;
        newNode = new Node(data); // new Node created
        Node current; // created to traverse the list
        current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;

        counter++;

    }
    // returns the element at the specified position in this list
    public Object get(int index) {

        Node current;
        current = head;
        for (int i = 0; i < index; i++) {
            if (current.next != null) {
                current = current.next;
            }
        }

        return current.getData();
    }

    //removes the element at the specified position in this list
    public boolean remove(int index) {

        Node current;
        Node trailCurrent;
        int reachIndex = 0;
        boolean found;

        //Case 1: The list is empty
        if (head == null) {
            System.err.println("Cannot delete from an empty list.");
        }
        //Case 2: The Node to be deleted is first
        else {
            if (index == 0) {
                head = head.next;

                if (head == null) { //In case of list only having one node
                    last = null;
                    counter--;

                }
            } else { // Given info searched for

                found = false;
                trailCurrent = head; //trailCurrent points to the first node ie head
                current = head.next; //points to the second node ie head.next
                reachIndex++;

                while (current != null && !found) {

                    if (reachIndex == index) {
                        found = true;
                    } else {
                        trailCurrent = current;
                        reachIndex++;
                        current = current.next;

                    }
                }

                //Case 3; if found then delete the node
                if (found) {
                    counter--;
                    trailCurrent.next = current.getNext();

                    if (last == current) { //If node to be deleted is last
                        last = trailCurrent;
                    }
                } else
                    System.out.println("Item to be deleted is not in the list.");
            }
        }

        return true;

    }

    // returns the String content of all the nodes in this list.
    public String toString() {

        Node current; // Used to traverse the list
        current = head;
        StringBuilder tempString = new StringBuilder();

        while (current != null) { //  while loops runs if more data needs to be printed
            tempString.append(current.data).append(" ");
            current = current.next;
        }

        return tempString.toString();



    }

    // returns the number of elements in this list.
    public int size() {
        return counter;
    }

    private static class Node {
        // reference to the next node in the chain, or null if there isn't one.
        Node next;
        Object data;

        // Node constructor
        public Node(Object dataValue) {
            // PLEASE IMPLEMENT YOUR CODE HERE
            data = dataValue;
        }

        // these methods should be self-explanatory
        public Object getData() {
            return data;
        }

        public void setData(Object dataValue) {
            // PLEASE IMPLEMENT YOUR CODE HERE
            data = dataValue;
        }

        // return the next node of the current node
        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            // PLEASE IMPLEMENT YOUR CODE HERE
            next.setData(nextValue);
        }

    }
}
