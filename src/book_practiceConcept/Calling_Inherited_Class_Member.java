package book_practiceConcept;

//You may also use this to access members of the parent class that are accessible from the child class,
//since a child class inherits all of its parent members.

public class Calling_Inherited_Class_Member extends Fish {
    private int numberOfFins = 8;
    public Calling_Inherited_Class_Member(int age){
        super(age);
        this.size = 4;
    }

    //public Calling_Inherited_Class_Member() {
    //}

    public void dispalyDetails(){
        System.out.print("Shark with age : "+ getAge());
        System.out.print(" and " + size + " meters long");
        System.out.print(" with " + numberOfFins + " fins");
    }

    public static void main(String[] args) {
        Calling_Inherited_Class_Member c = new Calling_Inherited_Class_Member(10);
        c.dispalyDetails();
    }
}
class Fish{
    protected int size;
    private int age;
    public Fish(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

//we could use this or super to access a member of the parent class, but is the same true for a member of the child class?
// This code will not compile because numberOfFins is only a member of the current class,
//not the parent class. In other words, we see that this and super may both be used for
//methods or variables defined in the parent class, but only this may be used for members
//defined in the current class.