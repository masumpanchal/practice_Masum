package book_practiceConcept;

public class ReturningValues {
    public static void main(String[] args) {
        int numbers = 1;
        String letters = "abc";
        numbers(numbers);
        letters = letters(letters);
        System.out.println(letters + numbers);
    }
    public static int numbers(int numbers){
        numbers++;
        return numbers;
    }
    public static String letters(String letters){
        letters += "d";
        return letters;
    }
}
