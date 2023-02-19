package practice_tewel;

public class One_DoublyLinkedListCount {
    public static void main(String[] args){
        One_DoublyLinkedListCount list = new One_DoublyLinkedListCount();
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(4);
        list.addNode(5);
        list.display();
        System.out.println("Total nodes are : " + list.count());
    }
    class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head;
    public void addNode(int data){

        Node node = new Node(data);
        Node current = head;
        //node.next = null;

        if (head == null){
            node.prev = null;
            head = node;
            return;
        }

            while (current.next!= null) {
                current = current.next;
            }
            current.next = node;
            current.prev = current;

    }
    public void display(){
        Node current = head;
            while (current != null){
                System.out.print(current.data+ " ");
                current = current.next;
            }
    }
    public int count(){
        int counter=0;
        Node current = head;
        while (current != null){
            counter++;
            current = current.next;
        }
        return counter;
    }
}
