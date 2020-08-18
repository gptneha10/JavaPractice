package LinkedList;

public class LinkedList{
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

    public void show(){
        Node n=head;
        while(n.next!=null){
            System.out.print(n.data + " ");
            n=n.next;

        }
        System.out.print(n.data);
        System.out.print("");
    }

    public int size(){
        Node n=head;
        int count=0;
        while(n!=null){
            count=count+1;
            n=n.next;
        }
        return count;
    }

    public void findMiddleElement(){
        int len=size();
        System.out.println("length: "+len);
        System.out.println("counter: "+(len/2-1));
        Node n=head;
        Node prev=null;
        int count=0;
        while(count<=((len/2)-1)){
            System.out.println("data: "+n.data);
            prev=n;
            n=n.next;
            count=count+1;
            System.out.println("count: "+count);
        }
        if(len%2==1) {
            System.out.println("Middle Element: " + n.data);
        }
        else{
            System.out.print("Middle Element: " + prev.data+" "+ n.data);

        }


}


}

