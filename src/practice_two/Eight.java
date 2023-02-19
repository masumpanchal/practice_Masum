package practice_two;

//Freqancy of element
public class Eight {
    public static void main(String[] args){
        int a[] = {1, 2, 8, 3, 2, 2, 2, 5, 1 };
        int fq[] = new int[a.length];
        int visited = -1;
        for(int i =0; i< a.length; i++){
            int count=1;
            for (int j =i+1; j< a.length; j++){
                if (a[i] == a[j]){
                    count++;
                    fq[j] = visited;
                }
            }
            if (fq[i] != visited){
                fq[i] = count;
            }
        }

        for(int i=0; i< fq.length; i++) {
            if (fq[i] != visited) {
                System.out.println(a[i] + " " + fq[i]);
            }
        }
    }
}
