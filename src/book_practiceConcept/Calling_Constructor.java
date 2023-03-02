package book_practiceConcept;

public class Calling_Constructor extends Ape {
    public static void main(String[] args) {
        new Calling_Constructor();
    }
}
class Primate{
    public Primate(){
        System.out.println("Primate");
    }
}
class Ape extends Primate{
    public Ape(){
        System.out.println("Ape");
    }
}