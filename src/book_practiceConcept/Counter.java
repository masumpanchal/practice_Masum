package book_practiceConcept;

// This example relies on the fact that static (and instance) variables are automatically initialized to the default value
// for that type, which is 0 for int.
public class Counter {
    private static int count;
    public Counter(){count++;}

    public static void main(String[] args) {

        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count);
    }
}
