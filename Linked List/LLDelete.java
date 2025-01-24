public class LLDelete {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode =head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
//Delete current Head
    public void deleteFirst(){
        if(head==null){
            System.out.println("List is empty");
        }
        head=head.next;
    }
//Delete current tail
    public void deleteLast() {
        // Check if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
    
        // If there's only one node in the list, set head to null
        if (head.next == null) {
            head = null;
            return;
        }
    
        // Initialize pointers to traverse the list
        Node secondLastNode = head; // Pointer to track the second last node
        Node lastNode = head.next; // Pointer to track the last node
    
        // Traverse until the last node is reached
        while (lastNode.next != null) {
            lastNode = lastNode.next; // Move lastNode to the next node
            secondLastNode = secondLastNode.next; // Move secondLastNode to the next node
        }
    
        // Set the next of second last node to null to remove the last node
        secondLastNode.next = null;
    }
    
//delete at a specific position
public void deletemiddle(int position) {
    // Check if the list is empty
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // If the position is 0, delete the first node directly
    if (position == 0) {
        head = head.next; // Update the head to the next node
        return;
    }

    // If there's only one node in the list, set head to null
    if (head.next == null) {
        head = null; // Clear the only node in the list
        return;
    }

    // Initialize pointers for traversal
    Node prevNode = null; // To keep track of the previous node
    Node currNode = head; // To traverse the list starting from the head
    int count = 0;        // Counter to track the current position

    // Traverse the list to reach the given position
    while (currNode != null && count < position) {
        prevNode = currNode;       // Update prevNode to the current node
        currNode = currNode.next; // Move currNode to the next node
        count++;                  // Increment the position counter
    }

    // If the position is beyond the size of the list
    if (currNode == null) {
        System.out.println("Position out of bounds");
        return;
    }

    // Unlink the target node by skipping over it
    prevNode.next = currNode.next;
}

//Display a linked list
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        int size =0;
        while(currNode!=null){
            System.out.print(currNode.data+"=>");
            currNode = currNode.next;
            size++;
        }
        System.out.println("null");
        System.out.println("Size of the list is "+size);
    }
    public static void main(String[] args) {
        LLDelete list = new LLDelete();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println("Before delete");
        list.display();
        System.out.println("Delete at a specific position");
        list.deletemiddle(1);
        list.display();
        // System.out.println("After delete First element");
        // list.deleteFirst();
        // list.display();
        // System.out.println("After delete Last element");
        // list.deleteLast();
        // list.display();

    }
}