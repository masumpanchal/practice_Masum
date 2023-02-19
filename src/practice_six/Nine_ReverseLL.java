package practice_six;

public class Nine_ReverseLL {
    public static void main(String[] args){
        Nine_ReverseLL sList = new Nine_ReverseLL();
        sList.addNode(1);
        sList.addNode(2);
        sList.addNode(3);
        sList.addNode(4);

        System.out.println("Original List");
        sList.printLL();

        System.out.println("Reverse List");
        sList.reverse(sList.head);
    }
    Node head;
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addNode(int data){
        Node newNode = new Node(data);
        if (head== null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void printLL(){
        Node current = head;
        if(head==null){
            System.out.println("List is empty");
        }
        while (current != null){
            System.out.println(current.data+"-->");
            current = current.next;
        }
        System.out.println();
    }
    public void reverse(Node current){
        if (head == null){
            return;
        }
        else {
            if (current.next ==null){
                System.out.println(current.data+ " ");
                return;
            }
            reverse(current.next);
            System.out.println(current.data+ " ");
        }
    }
}
