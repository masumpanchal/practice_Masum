package Opps_Practice_RealTime;

//Encapsulation is one of the fundamentals of OOP (object-oriented programming).
//It refers to the bundling of data with the methods that operate on that data.
//Encapsulation is used to hide the values or state of a structured data object inside a class,
//preventing unauthorized parties' direct access to them.

public class Encapsulation {
    //private data member
    private String name;
    //getter method for name
    public String getName(){
        return name;
    }
    //setter method for name
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();

        //setting value in the name member
        e.setName("abc");

        //getting value of the name member
        System.out.println(e.getName());

    }
}
