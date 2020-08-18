public class QueueArrayPractical {
    int []queue=new int[5];
    static int front=-1,rear=-1;

    public static void main(String []s){
        QueueArrayPractical queue=new QueueArrayPractical();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println("hiiiiiiii");
        queue.enqueue(6);
       // System.out.println("After enqueue");
        //queue.show();

       // System.out.println("");
        //System.out.println("After dequeue");
        queue.dequeue();
        System.out.println("hiiii22222");
        queue.enqueue(6);
        //queue.show();

        System.out.println("");
        System.out.println("After dequeue2");
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(7);
        queue.enqueue(8);


        //queue.show();


    }

    public void enqueue(int data){
        if (front==-1 && rear==-1){
            queue[0]=data;
           // front++;
            rear++;
        }
        else if((rear==queue.length-1 && front==-1)|| (rear==front && queue[rear]!=0)){
            System.out.println("Queue is full");
        }
        else if(rear<queue.length-1 || rear<front){
            queue[rear+1]=data;
            rear++;
        }
        else if(rear==queue.length-1 && front>-1 ){
           queue[0]=data;
           rear=0;
        }
        show();
        System.out.println("");
        System.out.println("Front :"+front);
        System.out.println("Rear :"+rear);
    }

    public void dequeue(){
        if ((front==-1 && rear==-1) || (rear==front && queue[rear]==0)){
            System.out.println("queue is empty");
        }
        else if(front<queue.length-1){
            queue[front+1]=0;
            front++;
        }
        else if(front==queue.length-1 && rear>-1){
            queue[0]=0;
            front=0;
        }
        show();
        System.out.println("");
        System.out.println("Front :"+front);
        System.out.println("Rear :"+rear);
    }

    public void show(){
        for (int n=0;n<queue.length;n++){
            System.out.print(queue[n]+ " ");
        }
    }
}

