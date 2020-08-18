package LinkedList;

class Stack{
    Node top;

    public void push(int data){
        Node node = new Node();
        node.data=data;

        if(top==null){
            top=node;
        }
        else{
          // Node temp=top;
         node.next=top;
         top=node;
        }
  }

  public void pop(){
        if(top==null){
            System.out.println("Stack is empty");
        }
        else{
            top=top.next;
        }
  }

  public void show(){
        Node n=top;
        while(n.next!=null){
            System.out.print(n.data + " ");
            n=n.next;
        }
      System.out.println(n.data);
  }

}
public class StackImplementation {
    public static void main(String []args){
        Stack s=new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.show();
        System.out.println("");
        s.pop();
        s.show();

    }

}
