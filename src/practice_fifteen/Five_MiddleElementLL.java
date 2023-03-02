package practice_fifteen;

public class Five_MiddleElementLL {
    public static void main(String[] args){
        Five_MiddleElementLL ll = new Five_MiddleElementLL();
        ll.add(30);
        ll.add(50);
        ll.add(60);
        ll.add(0);
        ll.display();
        ll.findMiddel();
    }
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void add(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        Node temp= head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public void display(){
        Node current = head;
        if (head==null){
            System.out.println("List is empty");

        }
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int findMiddel(){
        Node slowp = head;
        Node fastp = head;
        if (fastp != null && fastp.next != null){
            slowp = slowp.next;
            fastp = fastp.next.next;
        }
        return slowp.data;
    }
}
