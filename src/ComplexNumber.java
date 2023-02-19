import java.util.Scanner;
public class ComplexNumber {

    double real, img;

    ComplexNumber(double r, double i){
        this.real = r;
        this.img = i;
    }
    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;

        return temp;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);



        System.out.println("Enter c1 real Number : ");
        double real1 = sc.nextDouble();
        System.out.println("Enter c1 img Number : ");
        double img1 = sc.nextDouble();
        System.out.println("Enter c2 real Number : ");
        double real2 = sc.nextDouble();
        System.out.println("Enter c2 img Number : ");
        double img2 = sc.nextDouble();

        ComplexNumber c1 = new ComplexNumber(real1, img1);
        ComplexNumber c2 = new ComplexNumber(real2, img2);
        ComplexNumber temp = sum(c1, c2);



        System.out.println("Sum is " + temp.real+ "+" + temp.img + "i");

    }



}
