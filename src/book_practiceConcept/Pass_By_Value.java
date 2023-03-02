package book_practiceConcept;

public class Pass_By_Value {
    public static void main(String[] args) {
        int original1 = 5;
        int original2 = 10;
        swap(original1, original2);
        System.out.println("This is Original value "+original1+ " " + original2);
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("This is A's value inside swap " + a);
        System.out.println("This is B's value inside swap " +b);
    }
}
