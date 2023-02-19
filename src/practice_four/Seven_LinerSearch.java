package practice_four;

public class Seven_LinerSearch {
    public static void main(String[] args){
        int a[] = {1, 2, 78, 96, 110, 5, 65, 22, 4, 99};
        int b = 22;
        for (int i=0; i<a.length; i++){
            if (a[i] == b){
                System.out.println(b + " is on the " + i + " th index");
            }
        }
    }
}
