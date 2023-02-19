package practice_six;

public class Six_MatrixEqual {
    public static void main(String[] args){
        int a[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };
        int b[][] = {
                {1, 2, 3},
                {8, 4, 6},
                {4, 5, 7}
        };

        int row=a.length, row1= b.length, col=a[0].length,col1=b[0].length;
        boolean flag = true;

        if (row != row1 && col != col1){
            System.out.println("Is not same matrix");
        }
        else{
            for (int i=0; i<row; i++){
                for (int j=0; j<col; j++){
                    if (a[i][j] != b[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }
        }
        if (flag) System.out.println("Is same Matrix............");
        else System.out.println("Is not same Matrix............");

    }
}
