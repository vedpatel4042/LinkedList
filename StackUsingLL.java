
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public class StackUsingLL{
        public static Node head;
        public boolean  isEmpty(){
         return head==null;   
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        public int pop(){
           if(isEmpty()){
            return -1;
           }
           int top = head.data;
           head = head.next;
           return top;
        }
        public int peek(){
            if(isEmpty()){
                return -1;
               }
               int top = head.data;
               return top;
        }
         public static void main(String[] args) {
            StackUsingLL stack = new StackUsingLL();
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
            }
            System.out.println(stack.peek());
        }
    }


