package practiceCode;
//Did you say both print "abcdefg"? Good. There’s only one StringBuilder object
//here. We know that because new StringBuilder() was called only once. On line 5, there
//are two variables referring to that object, which has a value of "abcde". On line 6, those
//two variables are still referring to that same object, which now has a value of "abcdefg".
//Incidentally, the assignment back to b does absolutely nothing. b is already pointing to that
//StringBuilder.
public class New_String {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        String x = "Hello world";
        String y = " Hello world".trim();
        System.out.println(y);
        System.out.println(x.equals(y));

    }
}
