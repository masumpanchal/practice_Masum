package practice_tewel;

public class Four_BinaryToDecimal {
    public static void main(String[] args){
        String binaryString = "1010";
        int decimal = Integer.parseInt(binaryString, 2);
        System.out.println(decimal);
        System.out.println(Integer.parseInt("1010",2));
        System.out.println(Integer.parseInt("10101",2));
        System.out.println(Integer.parseInt("11111",2));
    }
}
