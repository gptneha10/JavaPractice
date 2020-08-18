class Node11{
    int data;
    Node next;
}

class LinkedList11 {
    Node head;


    public void add(int data) {
        Node node=new Node();
        node.data=data;

        if (head == null) {
            head = node;

        }
        else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next=node;
        }
    }

    public void remove(int data){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            Node n=head;
            while(n.next.data!=data){
                n=n.next;
            }
            n.next=n.next.next;
        }
    }

    public void sort(int data){
        Node node=new Node();
        node.data=data;
        node.next=null;


        if(head==null){
            head=node;
        }
        else if(head.data>node.data){
            node.next=head;
            head=node;
        }
        else{
            Node n=head;
            while(n.next!=null && n.next.data<node.data  ){
                n=n.next;
            }
            Node temp=n.next;
            n.next=node;
            node.next=temp;
        }


    }

    public static void mergeSortedList(LinkedList11 l1,LinkedList l2){
        Node11 node=new Node11();


        if(l1==null){

        }


    }

    public void show() {
        Node n = head;
        while (n.next != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.print(n.data);
    }
}
    public class MergeSortedLinkedList {
        public static void main(String []args){
            LinkedList11 list=new LinkedList11();
            System.out.println("List 1: ");
            list.add(2);
            list.add(3);
            list.add(5);
            list.add(1);
            list.show();

            list.remove(5);
            System.out.println("");
            list.show();

            System.out.println("");
            System.out.println("Sorted List1 :");
            LinkedList11 list2=new LinkedList11();
            list2.sort(5);
            list2.sort(3);
            list2.sort(1);
            list2.sort(9);
            list2.sort(4);
            list2.sort(6);
            //System.out.println("");
            list2.show();

            System.out.println("");
            System.out.println("Sorted List2 :");
            LinkedList11 list3=new LinkedList11();
            list3.sort(11);
            list3.sort(3);
            list3.sort(2);
            list3.sort(8);
            list3.sort(5);
            list3.sort(6);
            //System.out.println("");
            list3.show();

        }



    }




