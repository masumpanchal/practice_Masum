package pratice_thirteen;

public class Eight_DeleteNodeFrom {
    public static void main(String[] args){
        Eight_DeleteNodeFrom newll = new Eight_DeleteNodeFrom();
        newll.addNode(1);
        newll.addNode(2);
        newll.addNode(3);
        newll.addNode(4);
        newll.print();
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

    void addNode(int data){
        Node new_node = new Node(data);
        Node current = head;
        if(head == null){
           head = new_node;
           return;
        }
        while (current.next != null) {
            current = current.next;
        }
        current.next = new_node;
    }

    public void print(){
        Node temp = head;
        if (head==null){
            System.out.println("List is empty....");
        }
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    /*public void deleteNode() {
        Node temp =  head;
        if(head == null){
            System.out.println("List is empty.....");
        }
        else {
            //Checks whether the list contains only one node
            //Checks whether the list contains only one node
            if (head !=  )
        }
    }*/
}
