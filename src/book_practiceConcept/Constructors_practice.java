package book_practiceConcept;

public class Constructors_practice {
    private String color;
    private int height;
    private int length;
    public Constructors_practice(int length, int theHeight){
        length = this.length; //Backwards- no good!
        height = theHeight;   // Fine because a name is different;
        this.color = "white"; // Fine, but redundant
    }
    public static void main(String[] args) {
        Constructors_practice c = new Constructors_practice(1,  2);
        System.out.println(c.length + " " + c.height + " " + c.color);
    }
}
