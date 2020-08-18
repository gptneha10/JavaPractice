class Node2{
    int data;
    Node2 next;
}

class Stack{
    //Node2 head;
    Node2 top;

    public void push(int data){
        Node2 node=new Node2();
        node.data=data;
        node.next=null;

        if(top==null){
            top=node;
            System.out.println("top :"+top.data);
        }
        else{
            Node2 temp=top;
            node.next=temp;
         //   System.out.println("node :"+node.data);
          //  System.out.println("nodenext :"+node.next.data);
            top=node;
           // System.out.println("new top"+top.data);
        }
    }

    public void pop() {
        if (top == null) {
            System.out.println("Stack is empty");
        }
        else{
            top=top.next;
        }
    }

    public void peek(){
        if (top == null) {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(top.data);
        }
    }

    public void show(){
        if(top==null){
            System.out.println("Stack is empty");
        }

        else{
            Node2 n=top;
            while(n.next!=null){
                System.out.print(n.data + " ");
                n=n.next;
            }
            System.out.print(n.data);

        }
    }
}

public class StackPractical {
    public static void main(String []args){
        Stack s=new Stack();
        s.push(2);
       s.push(1);
       s.push(3);
        s.push(4);
        System.out.println("");
        System.out.println("After push :");
        s.show();

        System.out.println("");
        System.out.println("After pop :");
        s.pop();
        s.show();

        System.out.println("");
        System.out.println("After pop2 :");
        s.pop();
        s.show();

        System.out.println("");
        System.out.println("After peek :");
        s.peek();
        s.show();




    }

}
