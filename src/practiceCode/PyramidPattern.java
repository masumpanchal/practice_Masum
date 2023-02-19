package practiceCode;

public class PyramidPattern {
    public static void main(String[] args){
        for (int i=0; i<=4; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();

        //--------------------------------------------------------------------------------------------------------------
        for (int a=0; a<=6; a++){
            for (int b=6; b>=a; b--){
                System.out.print(" ");
            }
            for (int c=0; c<=a;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
