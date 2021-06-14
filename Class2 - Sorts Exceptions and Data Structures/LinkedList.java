class LinkedList {
    Node head = null; // head of the list
 
    /* Linked list Node*/
    static class Node {
        String name;
        Node next;
        Node prev;
 
        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(String s) { 
            name = s; 
            next = null;
            prev = null;
        }
    }
}