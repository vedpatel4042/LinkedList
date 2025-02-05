public class LLDelete2 {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void addData(int data){
        Node newNode = new Node(data);
        if(head == null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null) { 
            currNode=currNode.next;
        }
        currNode.next=newNode;

    }
   public void display() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }
    Node currNode = head;
    while (currNode != null) { 
        System.out.print(currNode.data + " => ");
        currNode = currNode.next;
    }
    System.out.println("null");
}

    public void delete(int data){
        if(head == null){
            System.out.println("List is empty");
        }
        if(head.next == null){
           head=null;
        }
        Node prevNode=null;
        Node currNode=head;
        while (currNode.next!=null) {
            prevNode=currNode;
            currNode=currNode.next;
            if(currNode.data == data){
                break;
            }
        }
        prevNode.next=currNode.next;
    }
    public static void main(String[] args) {
        LLDelete2 list = new LLDelete2();
        for(int i=1;i<6;i++){
        list.addData(i);
        }
        list.display();
        System.out.println("After delete :- ");
        list.delete(4);
        list.display();
    }
}
