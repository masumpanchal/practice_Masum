package practiceCode;

public class MiddleElementLinkedList {
    Node head;
    public static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        //-----------------------------------------------Add Method-----------------------------------------------

        public void add(int data){
            Node toInsert = new Node(data);
            if(head == null){
                head=toInsert;
                return;
            }
            Node temp = head;

            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = toInsert;
        }

        //------------------------------------------------Print Method------------------------------------------
        public void print(){
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.data+"__>");
                temp=temp.next;
            }
        }

    public static void main(String[] args){
        MiddleElementLinkedList ml = new MiddleElementLinkedList();
        ml.add(1);
        ml.add(2);
        ml.add(3);
        ml.add(4);
        ml.add(5);
        ml.add(6);
        ml.add(7);

        ml.print();
        System.out.println();
        ml.FindMiddle();

    }

    public void FindMiddle(){
        Node slowpointer = head;
        Node fastpointer = head;
        while (fastpointer != null && fastpointer.next!=null){
            fastpointer = fastpointer.next.next;
            slowpointer = slowpointer.next;
        }
        System.out.println(slowpointer.data);
    }
}
