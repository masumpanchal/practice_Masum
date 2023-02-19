package com.masum;

public class Student {
    String name;
    int rollNo;
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }
    public static void main(String[] args){
        Student s1 = new Student("Ravi", 101);
        Student s2 = new Student("Durga", 102);
        System.out.println(s1.name+" "+s1.rollNo);
        System.out.println(s2.name+" "+s2.rollNo);
    }

    Student(){
        super();
        System.out.println("constructor");

    }

}


