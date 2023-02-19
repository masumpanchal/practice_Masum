package pratice_thirteen;

public class Four_SquareRoot {
    public static void main(String[] args){
        int sq = 64;
        double t;
        double sqroot = sq/2;

        do {
            t = sqroot;
            sqroot = (t+(sq/t))/2;
        }while((t-sqroot)!=0);
        System.out.println(sqroot);
    }
}
