package LinkedList;
//reverse a queue using linked List

class Queue11{
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

    public void reverse(){
     //Node n=front;
     Node prev=null;
     Node curr=front;
     Node next;
     int count=0;
       /* System.out.println("front: "+front);
        System.out.println("curr: "+curr);
        System.out.println("curr.next: "+curr.next);
*/

      while(curr!=null){
      next=curr.next;
         // System.out.println("aaaaa: "+next);
      System.out.println("");
//        System.out.println("prev :"+ prev.data);
      System.out.println("curr :"+ curr.data);
//     System.out.println("next :"+ next.data);

      curr.next=prev;
      prev=curr;
      System.out.println("new prev :"+ prev.data);
      curr=next;
        // System.out.println("new curr :"+ curr.data);
      count=count+1;
          System.out.println("count:"+count);
      if(count==1){
          rear=prev;
      }
     }
      front=prev;
        System.out.println("rear: "+rear.data);
        System.out.println("front: "+front.data);


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

public class ReverseQueue {
    public static void main(String []args){
        Queue11 q=new Queue11();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.show();

        q.reverse();
        System.out.println("");
        q.show();





    }
}
