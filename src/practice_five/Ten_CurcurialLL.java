package practice_five;

public class Ten_CurcurialLL {
    public static void main(String[] args){
        Ten_CurcurialLL list = new Ten_CurcurialLL();
        list.addNode(100);
        list.addNode(200);
        list.addNode(300);
        list.addNode(400);
        list.addNode(500);
        list.printNode();

    }
    Node head = null;
    Node tail = null;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public void addNode(int data){

        Node insertNode = new Node(data);
        if (head==null){
            head = insertNode;
            tail = insertNode;
            insertNode.next = head;
            return;
        }else {
            tail.next = insertNode;
            tail = insertNode;
            tail.next = head;
        }

    }

    public void printNode(){
        Node current = head;
        while (current!=head){
            System.out.print(current.data + "--->");
            current = current.next;
        }
    }
}
