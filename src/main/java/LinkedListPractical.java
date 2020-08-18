class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head;
    static int count=0;
    public void insert(int data){

        Node node=new Node();
        node.data=data;
        node.next=null;



        if(head==null){
            head=node;
            count++;

        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;

        }
    }

    public void insertAt(int index,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(head==null){
            head=node;


        }
        else{
            Node n=head;
            for(int i=0;i<index-1;i++){
                    n=n.next;
            }
            Node temp=n.next;
            n.next=node;
            node.next=temp;

        }
    }

    public void insertAtStart(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;

        if(head==null) {
            head = node;
            count++;
        }
        else{
            Node temp=head;
            head=node;
            head.next=temp;
            count++;
        }
    }

    public void remove(int data) {
        Node n = head;

        while (n.next.next != null) {
            if (n.next.data == data) {
                n.next = n.next.next;
                break;
            }
            n = n.next;

        }

    }
        public void sort(){
            Node last=head;

            LinkedList sortedList=new LinkedList();

            //to find last element
            while(last.next!=null){
                last=last.next;
            }

            while(head.next!=null){
                Node n=head;
                Node h=head;
                while (n.next != null) {
                    Node nnext = n.next;

                    if (n.data < h.data) {
                        Node hnext = h.next;
                        int hdata = h.data;
                        h.data = n.data;
                        h.next = hnext;
                        n.data = hdata;
                        n.next = nnext;
                    }
                    else if (n.data > last.data) {
                        int ldata = last.data;
                        last.data = n.data;
                        last.next = null;
                        n.data = ldata;
                        n.next = nnext;
                    }
                    n= n.next;
                }
                    sortedList.insert(head.data);
                    head = head.next;
                    sortedList.show();
            }
            sortedList.insert(head.data);
            System.out.println("Sorted List:");
            sortedList.show();
    }

    public void sortedInsert(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        if(head==null){
            head=node;
        }
        else{
            Node n=head;
            if( n.next==null && node.data<n.data){
                head=node;
                head.next=n;
            }
            else{
            while(n.next!=null){
                if(node.data>n.data && node.data<n.next.data){
                    Node temp=n.next;
                    n.next=node;
                    node.next=temp;
                    break;
                }
                n=n.next;
            }
                n.next=node;
            }
        }
    }

    public void contains(int data){
        Node n=head;

        while(n.next!=null){
            if(n.data==data){
                System.out.println("Data found in list: "+ data);
                break;
            }
            n=n.next;
        }
        if(n.next==null && n.data==data) {
            System.out.println("Data found in list: " + data);
        }
        else if(n.next==null && n.data!=data){
            System.out.println("Data not found in list: "+ data);
        }
    }

    public void show(){
       Node n=head;
       while(n.next!=null){
           System.out.print(n.data + " ");
           n=n.next;

       }
        System.out.print(n.data);
        System.out.print("");
    }

}


public class LinkedListPractical {
    public static void main(String []a){
        LinkedList list=new LinkedList();
        list.insert(2);
        list.insert(55);
        list.insert(3);
        list.insertAt(2,11);
        list.insertAt(1,77);
        list.insertAt(5,4);
        list.insertAt(2,6);
        System.out.println("Before remove :");
        list.show();
        list.remove(4);
        list.remove(6);
        list.insertAtStart(1);

        System.out.println("");
        System.out.println("After remove :");
        list.show();

        System.out.println("");
        System.out.println("After sort :");
        list.sort();


        LinkedList list2=new LinkedList();
        list2.sortedInsert(4);
        list2.sortedInsert(11);
        list2.sortedInsert(7);
        list2.sortedInsert(33);
        list2.sortedInsert(5);
        System.out.println("");
        System.out.println("Sorted insert list :");
        list2.show();

        System.out.println("Find element");
        list2.contains(11);
        list2.contains(1);
        list2.contains(77);
        list2.contains(4);


    }
}
