package practice_ten;

public class Four_DeleteStartLL {
    public static void main(String[] args) {
        Four_DeleteStartLL ll = new Four_DeleteStartLL();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        System.out.println("Original List");
        ll.display();

        while (ll.head != null){
            ll.deleteFromStart();
            //Printing updated list
            System.out.println("Updated List");
            ll.display();

        }
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    Node head = null;
    Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    //deleteFromStart() will delete a node from the beginning of the list
    public void deleteFromStart() {
        //Checks if the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return;
        } else {
            //Checks whether the list contains only one node
            //If not, the head will point to next node in the list and tail will point to the new head
            if (head != tail) {
                head = head.next;
            }
            //If the list contains only one node
            //then, it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                System.out.print(current.data+ " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
