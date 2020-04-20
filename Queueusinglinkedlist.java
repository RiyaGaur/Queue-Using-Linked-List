public class Queueusinglinkedlist {
    Node front;
    Node rear;
    public Queueusinglinkedlist(){
        front = null;
        rear = null;
    }
    public boolean isEmpty(){
        return rear == null;
    }
    public void enqueue(Node newnode){
        if(isEmpty()){
            front = newnode;
            rear = newnode;
        }else{
            rear.next = newnode;
            rear = newnode;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue Underflow");
        }else{
            front = front.next;
        }
    }
    public void display(){
        if(front==null){
            System.out.println("Queue is empty");
        }else{
            Node temp = front;
            while(temp!=null){
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queueusinglinkedlist obj = new Queueusinglinkedlist();
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.enqueue(n3);
        obj.enqueue(n4);
        obj.enqueue(n5);
        obj.display();
        obj.dequeue();
        obj.display();
    }
}
