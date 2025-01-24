public class Practice{
    Node head;
    class Node{
        int  data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
        public void addLast(int data){
            Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                return;
            }
            Node currNode = head;
            while (currNode.next!=null) {
                currNode=currNode.next;
            }
            currNode.next=newNode;

        }

        public void display(){
            if(head==null){
                System.out.println("LL is Empty");
                return;
            }
            if(head.next==null){
                System.out.println(head);
            }
            Node currNode = head;
            int size =0;
            while (currNode!=null) {
                System.out.print(currNode.data+"=>");
                currNode=currNode.next;
                size++;
            }
            System.out.println("null");
            System.out.println("Size of LL is "+size);
        }
        public void delete(int possition){
            if(head==null){
                System.out.println("LL is Empty");
                return;
            }
            if(possition==0){
                head=head.next;
                return;
            }
            Node currNode=head;
            Node prevNode=null;
            int count=0;
            while(currNode!=null && count<possition){
                prevNode=currNode;
                currNode=currNode.next;
                count++;                
            }
            if (currNode == null) {
                System.out.println("Position out of bounds");
                return;
            }
            prevNode.next=currNode.next;
        }
        public static void main(String[] args) {
            Practice LL = new Practice();
            LL.addLast(1);
            LL.addLast(2);
            LL.addLast(3);
            LL.addLast(4);
            LL.addLast(5);
            LL.display();
            LL.delete(4);
            LL.display();
        }

    }
