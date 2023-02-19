package practiceCode;

public class PracticePattern {
    public static void main(String[] args){
        int n=5;
        for (int i=0; i<=n; i++){
            for (int j=n; j>=i; j--) {
                System.out.print(" ");
            }
                for(int x=0; x<=i; x++) {
                    System.out.print(x+ " ");
                }
                System.out.println();
            }
        }
    }
