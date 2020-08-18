package LinkedList;

class Queue1{
    Node front;
    Node rear;

    public void enqueue(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(front==null && rear==null){
            front=node;
        }
        else{
            Node n=front;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
            rear=node;
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

    // returns the head(front) of the queue
    public void peek(){
        if(front==null && rear==null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("peek: "+ front.data);
        }

    }

    // returns and removes the head(front) of the queue
    public void poll(){
        if(front==null && rear==null){
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("poll: "+ front.data);
            front=front.next;
        }

    }


    public void show(){

         if(front==null && rear==null){
             System.out.println("queue is empty");
         }
         else{
             Node n=front;
             while(n.next!=null){
                 System.out.print(n.data+ " ");
                 n=n.next;

             }
             System.out.print(n.data);
         }
    }
}

public class QueueImplementation {
    public static void main(String []args){
        Queue1 q=new Queue1();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.show();

        q.dequeue();
        System.out.println("");
        q.show();
        q.dequeue();
        System.out.println("");
        q.show();
        System.out.println("");
        q.peek();
        System.out.println("");
        q.show();
        System.out.println("");
        q.poll();
        System.out.println("");
        q.show();



    }
}
