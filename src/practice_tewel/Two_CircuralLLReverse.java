package practice_tewel;

public class Two_CircuralLLReverse {
    public static void main(String[] args){
        Two_CircuralLLReverse cc = new Two_CircuralLLReverse();
        cc.addNode(1);
        cc.addNode(2);
        cc.addNode(3);
        cc.addNode(4);
        cc.addNode(5);
        cc.display();
        cc.reverse(cc.head);

    }
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node head, tail;

    public void addNode(int data){
        Node new_node = new Node(data);
        if (head==null){
            head = new_node;
            tail = new_node;
            new_node.next = head;
        }
        else{
            tail.next = new_node;
        }
        tail = new_node;
        tail.next = head;
    }
    public void display(){
        Node current = head;
        if (head == null){
            System.out.println("List is empty");
        }else {
            do {
                System.out.print(current.data+ " ");
                current = current.next;
            }while (current != head);
        }
    }
    public void reverse(Node current){
        //Checks if the next node is head, if yes then prints it.
        if (current.next == head){
            System.out.print(current.data+ " ");
            return;
        }
        //Recursively calls the reverse function
        reverse(current.next);
        System.out.print(current.data+ " ");
    }
}
