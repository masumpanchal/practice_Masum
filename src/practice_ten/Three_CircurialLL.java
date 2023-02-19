package practice_ten;

public class Three_CircurialLL {
    public static void main(String[] args){
        Three_CircurialLL ll = new Three_CircurialLL();
        //Adds data to the list
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        //Displays all the nodes present in the list
        ll.display();
    }
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Declaring head and tail pointer as null.
    Node head = null;
    Node tail = null;

    //This function will add the new node at the end of the list.
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }else {
            //tail will point to new node
            tail.next = newNode;

            //New node will become new tail.
            tail = newNode;

            //Since, it is circular linked list tail will point to head.
            tail.next = head;
        }
    }
    //Displays all the nodes in the list
    void display(){
        Node current = head;
        if (head==null){
            System.out.println("LL is empty");
        } else{
            System.out.println("Node of the circular linked list is : ");
            do {
                //Prints each node by incrementing pointer.
                System.out.print(current.data);
                current = current.next;
            }
            while (current != head);
                System.out.println();

        }
    }
}
