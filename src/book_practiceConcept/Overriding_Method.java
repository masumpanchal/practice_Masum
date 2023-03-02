package book_practiceConcept;

public class Overriding_Method extends Canine {
    @Override
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }

    public static void main(String[] args) {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Overriding_Method().getAverageWeight());
    }
}
class Canine{
    public double getAverageWeight(){
        return 50;
    }
}

