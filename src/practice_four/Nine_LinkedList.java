package practice_four;

public class Nine_LinkedList {
    public static void main(String[] args){
        Nine_LinkedList list = new Nine_LinkedList();
        list.head = new Node(100);
        Node second = new Node(200);
        Node Third = new Node(300);
        list.head.next = second;
        second.next = Third;
        list.display();

    }


     static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void display(){
        Node n = head;
        while (n != null){
            System.out.print(n.data + " ");
            n= n.next;
        }
    }
}
