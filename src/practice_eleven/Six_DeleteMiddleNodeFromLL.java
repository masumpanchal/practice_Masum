package practice_eleven;

public class Six_DeleteMiddleNodeFromLL {
    public static void main(String[] args){
    Six_DeleteMiddleNodeFromLL ll = new Six_DeleteMiddleNodeFromLL();
    ll.addNode(1);
    ll.addNode(2);
    ll.addNode(3);
    ll.addNode(4);
    //ll.addNode(5);
    ll.display();
    ll.deleteFromMid(ll.head);
    ll.display();
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
        Node current = head;
        if (head == null){
            head = newNode;
        }

        else {
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }
     Node deleteFromMid(Node node){
         Node slow, fast, prev;

         if(node == null && node.next == null){
            return null;
        }
         fast = slow = prev = node;
        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return node;
    }
    void display(){
        Node current = head;
        if (head==null){
            System.out.println("List is empty");
        }
        else {
            while (current != null){
                System.out.print(current.data+ " ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
