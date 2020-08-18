class Node1{
    int data;
    Node1 next;
    Node1 prev;
}

class DoubleLinkedList{
    Node1 head;
    public void insert(int data){
        Node1 node=new Node1();
        node.data=data;
        node.next=null;
        node.prev=null;

        if(head==null){
            head=node;
        }
        else{
            Node1 n=head;
            while(n.next!=null){
                n=n.next;
            }
            Node1 temp=n;
            n.next=node;
            node.prev=temp;
        }

    }

    public void remove(int data){
        Node1 n=head;

        while(n.next.data!=data){
            n=n.next;
        }

                n.next=n.next.next;
                n.next.prev=n;

    }

    public void insertAt(int index,int data){
        Node1 node=new Node1();
        node.data=data;
        node.next=null;
        node.prev=null;

        if(head==null){
            head=node;
        }
        else{
            Node1 n=head;
            for (int i=0;i<index-1;i++){
                n=n.next;
            }
            System.out.println("n :"+n.data);
            Node1 temp=n.next;
            n.next=node;
            node.next=temp;
            node.prev=n;
            if(node.next!=null) {
              node.next.prev = node;
            }

        }
    }

    public void show(){
        Node1 n=head;
        while(n.next!=null){
            System.out.print(n.data+ " ");
            n=n.next;
        }
        System.out.print(n.data);
    }

}

public class DoubleLinkedListPractical1 {
    public static void main(String []args){
        DoubleLinkedList list=new DoubleLinkedList();
        list.insert(2);
        list.insert(8);
        list.insert(3);
        list.insert(5);
        list.insert(1);
        list.insertAt(4,9);

        System.out.println("Before deletion: ");
        list.show();

        System.out.println("");
        //System.out.println("After deletion :");
        //list.remove(8);

        list.show();
    }
}
