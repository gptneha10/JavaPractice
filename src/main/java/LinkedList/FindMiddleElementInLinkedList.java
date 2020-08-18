package LinkedList;

public class FindMiddleElementInLinkedList {
    public static void main(String[] args) {


    LinkedList list = new LinkedList();
    list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(90);
        list.insert(50);
        list.insert(80);
        list.insert(70);
        list.insert(20);
       // list.insert(200);

        list.findMiddleElement();
    }
}
