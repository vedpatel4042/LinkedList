public class LLPrint {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }

    public void display() {
        // Check if the linked list is empty
        if (head == null) {
            System.out.println("Linked List is empty"); // Inform the user that the list is empty
            return; // Exit the method as there is nothing to display
        }
    
        Node currNode = head; // Start traversal from the head of the list
        while (currNode != null) { // Iterate through the list until the end is reached
            System.out.print(currNode.data + "=>"); // Print the data of the current node followed by '=>'
            currNode = currNode.next; // Move to the next node
        }
        System.out.println("NULL"); // Indicate the end of the list
    }
    
    public static void main(String[] args) {
        LLPrint list = new LLPrint();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        System.out.println("Add ad First");
        list.display();
        System.out.println("Add at Last");
        for(int i=4;i<=6;i++){
            list.addLast(i);
        }
        list.display();

    }
}
