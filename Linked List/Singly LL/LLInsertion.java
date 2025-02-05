public class LLInsertion {

    // Node class to represent each element in the linked list
    Node head;

    class Node {
        int data; // Stores the data of the node
        Node next; // Reference to the next node in the list

        Node(int data) {
            this.data = data; // Initialize node with data
            this.next = null; // Initially, the next node is null
        }
    }

    // Method to add a new node at the beginning of the linked list
    public void addFirst(int data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (head == null) { // If the list is empty, set head to the new node
            head = newNode;
            return;
        }
        newNode.next = head; // Point newNode to the current head
        head = newNode; // Update head to the new node
    }

    // Method to add a new node at the end of the linked list
    public void addLast(int data) {
        Node newNode = new Node(data); // Create a new node with given data
        if (head == null) { // If the list is empty, set head to the new node
            head = newNode;
            return;
        }

        Node curNode = head; // Start traversal from the head
        while (curNode.next != null) { // Traverse to the last node
            curNode = curNode.next;
        }
        curNode.next = newNode; // Set the next of the last node to the new node
    }

    public static void main(String[] args) {
        LLInsertion list = new LLInsertion();

        // Add nodes to the beginning of the list
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        // Add nodes to the end of the list
        list.addLast(4); 
        list.addLast(5); 
        list.addLast(6); 
    }
}
