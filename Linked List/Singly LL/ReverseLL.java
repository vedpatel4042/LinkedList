public class ReverseLL {
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
            Node newNode =new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode=head;
            while(currNode.next!=null){
                currNode=currNode.next;
            }
            currNode.next=newNode;
        }
        public void display(){
            if(head==null){
                System.out.println("LL  is Empty");
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+"=>");
                currNode=currNode.next;
            }
            System.out.println("null");
        }
//Itretive
        public void reverse(){
            if(head==null){
                System.out.println("LL  is Empty");
            }
            Node prevNode=head;
            Node currNode=head.next;
            while(currNode!=null){
                Node nextNode=currNode.next;
                currNode.next=prevNode;
                //update value
                prevNode=currNode;
                currNode=nextNode;
            }
            head.next=null;
            head=prevNode;
        }
//Recursive
        public void reverseRecursive(){
            if(head==null){
                System.out.println("LL  is Empty");
            }
            
            Node prevNode=head;
            Node currNode=head.next;
            //Base case
            if(currNode!=null){
                return;
            }
                Node nextNode=currNode.next;
                currNode.next=prevNode;
                //update value
                prevNode=currNode;
                currNode=nextNode;
            reverseRecursive();
            head.next=null;
            head=prevNode;
        }
        public static void main(String[] args) {
            ReverseLL ll =new ReverseLL();
            for (int i=0;i<=5;i++) {
                ll.addData(i);
            } 
            ll.display();
            System.out.println("Reverse LL");
            ll.reverse();
            ll.display();
            System.out.println("Reverse LL using Recursive");
            ll.reverseRecursive();
            ll.display();
        }
    }

