package book_practiceConcept;

// Order of Initialization

// 1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For now, just say “no superclass”
// and go on to the next rule.)
// 2. Static variable declarations and static initializers in the order they appear in the file.
// 3. Instance variable declarations and instance initializers in the order they appear in the file.
// 4. The constructor.

public class Constructor_InitializationOrder {
    private String name = "Torchie";
    {
        System.out.println(name);
    }
    private static int COUNT = 0;
    static {
        System.out.println(COUNT);
    }
    static {
        COUNT += 10;
        System.out.println(COUNT);
    }
    public Constructor_InitializationOrder(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Constructor_InitializationOrder c = new Constructor_InitializationOrder();
    }
}
