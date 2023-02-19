package practice_four;

public class Three_PrintElementArray {
    public static void main(String[] args){
        String[] a= {"aaa", "ccc", "zzz", "hhh", "jjj", "mmm", "lll"};
        for (String i: a) {
            System.out.print(i + " ");
        }
        System.out.println("Array in reverse order.....................");
        for (int i=a.length-1; i>=0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
