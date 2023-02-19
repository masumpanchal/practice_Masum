import java.util.*;

public class Main extends Class1{
    /*static void stringExample() {
        String s = "hello world!";
        System.out.println("s:" + s);

        /*System.out.println("\ns.length() :" + s.length());
        System.out.println("s.isEmpty() :" + s.isEmpty());*/

        /*Comparison
        System.out.println("\ns.equals(\"HELLO WORLD!\") :" + s.equals("HELLO WORLD!"));
        System.out.println("s.equalsIgnoreCase(\"HELLO WORLD!\") :" + s.equalsIgnoreCase("HELLO WORLD!"));
        System.out.println("s.compareTo(\"HELLO WORLD!\") :" + s.compareTo("HELLO WORLD!"));*/

        /*Searching
        System.out.println("s.contains(\"HELLO WORLD!\") :"+ s.contains("HELLO WORLD!"));
        System.out.println("s.contains(\"world\") :" + s.contains("world!"));
        System.out.println("s.startsWith(\"HELLO WORLD!\") :" + s.startsWith("HELLO WORLD!"));*/

        //Examining individual characters
        //System.out.println("\ns.charAt(4) :" + s.charAt(4));

        //Extracting substring
        //System.out.println("\ns.substring(4) :" + s.substring(4));

        // Spilt
        //System.out.println("\ns.split(\"o\") :");
        /*String[] sa = s.split("r");
        for (String temp : sa) {
            System.out.println(temp);
        }*/

    /*static void stringPool () {
        String s1 = "hello!";
        String s2 = "hello!";
        String s3 = "hello!".intern();
        String s4 = new String("hello!");
        String s5 = "lo!";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);


    }*/
    /*public static void main(String[] args) {
        String s = "hello" + " world!";
        System.out.println("s :" + s);

        StringBuilder sb = new StringBuilder(s);
        sb.append(" good").append(" morning :)");
        System.out.println("sb:" + sb.toString());
        System.out.println("sb:" + sb.length());
        sb.delete(1, 5);
        System.out.println("sb:" + sb.toString());
        System.out.println("sb:" + sb.length());
        sb.insert(1, "ey");
        System.out.println("sb:" + sb.toString());
        System.out.println("sb:" + sb.length());
        */


    public static void main(String[] args){
        Main m1 = new Main();
        m1.display();
    }

}
class Class1{
    public void display(){
        System.out.println("Hello Class1");
    }
}
class Class2{
    public void show(){
        System.out.println("Hello Class2");
    }
}


