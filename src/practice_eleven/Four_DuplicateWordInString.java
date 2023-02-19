package practice_eleven;

public class Four_DuplicateWordInString {
    public static void main(String[] args){
        String str = "Big black bug bit a big black dog on his big black nose";
        int count;
        str.toLowerCase();
        //Split the string into words using built-in function
        String word[] = str.split(" ");
        System.out.println("Duplicate words in a given string : ");

        for (int i=0; i<word.length; i++){
            count=1;
            for (int j=i+1; j< word.length; j++){
                if (word[i].equals(word[j])){
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    word[j]= "0";
                }
            }
            if (count > 1 && word[i] != "0"){
                System.out.println(word[i]);
            }
        }
    }
}
