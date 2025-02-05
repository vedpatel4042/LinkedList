public class DLLInsertion {
    Node head, tail;

    public DLLInsertion() {
        this.head = this.tail = null;
    }

    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = this.prev = null;
        }
    }
//Add at first
    public void pushFront(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // head point to next new Node
        newNode.next = head;
        // establis backword connection
        head.prev = newNode;
        // Asign new newNode value
        head = newNode;
    }
//Add at last
    public void pushBack(int data){
        Node newNode = new Node(data);
    
        if (head == null) {
            head = tail = newNode;
            return;
        }  
            newNode.prev=tail;
            tail.next=newNode;
            tail=newNode;
        
    }
//Add data at specific Position
     public void push_specific_position(int pos,int data){
        Node newNode = new Node(data);
        if (head == null || pos < 1) {
            pushFront(data);
            return;
         }
         int count=1;
         Node curr=head;
         while (curr.next!=null && count<=pos-1) {
         curr=curr.next;
            count++;
         }
         if (curr.next == null) {
            pushBack(data);
            return;
         }
         // Insert at specific position
         newNode.next = curr.next;  // Connect newNode's next to current's next
         newNode.prev = curr;       // Set newNode's prev to current node
         curr.next.prev = newNode;  // Update next node's previous pointer to newNode
         curr.next = newNode;       // Set current's next to newNode
        }

 //Traverse From tail
    public void displayBackword() {
        if (head == null) {
            System.out.println("LL is Empty");
            return;
        }
        Node curr = tail;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.prev;
        }
        System.out.println("Null");
    }

//Traverse From head
    public void displayForword(){
        if(head==null){
             System.out.println("LL is Empty");
            return;
     }
    Node curr=head;
    while (curr!=null) {
        System.out.print(curr.data+" <-> ");
        curr=curr.next;
    }
    System.out.println("Null");
    }
    public static void main(String[] args) {
        DLLInsertion LL = new DLLInsertion();
        for (int i = 1; i < 6; i++) {
            LL.pushBack(i);
        }
        System.out.println("Print before add at specific position");
        LL.displayBackword();
        LL.push_specific_position(4, 8);
        System.out.println("Print after add at specific position");
        System.out.println("Print Forword");
        LL.displayForword();
        System.out.println("Print Backword");
        LL.displayBackword();
    }
}
