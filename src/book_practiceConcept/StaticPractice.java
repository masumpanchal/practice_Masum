package book_practiceConcept;



//Calling non-static method from static method.................
public class StaticPractice {
    private String name = "Static";
    public static void first(){};
    public static void second() {};
    public void four(){};
    public void third(){
        System.out.println(name);
        StaticPractice.first();
        four();
    }

    public static void main(String[] args) {
        first();
        second();
        StaticPractice static_new = new StaticPractice();
        static_new.third();

    }
}
