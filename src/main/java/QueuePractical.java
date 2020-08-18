class Node3{
    int data;
    Node3 next;
}

class Queue{
    Node3 front;
    Node3 rear;
    public void enqueue(int data){
        Node3 node=new Node3();
        node.data=data;
        node.next=null;

        if(front==null && rear==null){
            rear=node;
            front=node;
        }
        else{
            rear.next=node;
            rear=rear.next;
        }
    }

    public void dequeue(){
        if(front==null && rear==null){
            System.out.println("Queue is empty");
        }
        else{
         front=front.next;
        }

    }
    public void show(){
        if(front==null && rear==null){
            System.out.println("Queue is empty");
        }
        else{
            Node3 n=front;
            while(n.next!=null){
                System.out.print(n.data + " ");
                n=n.next;
            }
            System.out.print(rear.data);

        }

    }
}

public class QueuePractical {
    public static void main(String []s) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(5);

        System.out.println("");
        System.out.println("After enqueue");
        queue.show();


        queue.dequeue();
        queue.dequeue();
        System.out.println("");
        System.out.println("After dequeue");
        queue.show();

    }
}
