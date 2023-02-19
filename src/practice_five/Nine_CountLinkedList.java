package practice_five;

public class Nine_CountLinkedList {
    public static void main(String[] args){
        Nine_CountLinkedList list = new Nine_CountLinkedList();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(600);
        list.add(700);

        list.display();
        System.out.println();
        list.count();


    }
    Node head;
    Node tail;
     class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

     void display(){
        Node n = head;
        while (n!=null){
            System.out.print(n.data + "---->");
            n = n.next;
        }
    }

    public void add(int data){
         Node newNode = new Node(data);
         if (head==null){
             head = newNode;
             return;
        }
        Node temp = head;
         while (temp.next != null){
             temp = temp.next;
         }
         temp.next = newNode;
     }
     public void count(){
         Node temp = head;
         int count = 0;
         while (temp!= null){
             count++;
             temp = temp.next;
         }
         System.out.println("Total Nodes is " + count);
     }
}
