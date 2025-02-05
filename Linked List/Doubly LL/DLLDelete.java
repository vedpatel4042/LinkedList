

public class DLLDelete {
    Node head,tail;

     DLLDelete() {
        this.head=this.tail=null;
    }
    
    class Node{
        int data;
        Node next;
        Node prev;
        Node (int data){
            this.data = data;
            this.next=this.prev = null;
        }
    }
    public void addData(int data){
        Node newNode = new Node(data);
        if(head==null){
            head =tail= newNode;
        }
        newNode.prev=tail;
        tail.next=newNode;
        tail=newNode;
    }
    public void display(){
        if(head==null){
            System.out.println("List is empty");
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" <-> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void delete(int data){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        else if(head.data==data){
            head=head.next;
            return;
        }
        else if(tail.data==data){
            tail.prev.next=null;
            return;
        }
        Node curr=head;
        while (curr.next!=null) { 
            curr=curr.next;
            if(curr.data==data){
                curr.prev.next=curr.next;
                curr.next.prev=curr.prev;
            }
        }
    }
    public static void main(String[] args) {
        DLLDelete ll = new DLLDelete();
        ll.addData(1);
        ll.addData(2);
        ll.addData(3);
        ll.addData(4);
        ll.addData(5);
        System.out.println("Before Delete :- ");
        ll.display();
        System.out.println("After delete :- ");
        ll.display();
    }
}
