package practice_three;

public class Four_ArrayRotation {
    public static void main(String[] args){
        int a[] = {1, 2, 3, 4, 5};
        int n = 3;
        System.out.println("Original Array");
        for (int i: a) {
            System.out.print(i+ " ");
        }

        //Rotate the given array by n times toward left
        for (int i =0; i<n; i++){
            int j, first;
            //Stores the first element of the array
            first = a[0];
            for (j=0; j< a.length-1; j++){
                //Shift element of array by one
                a[j] = a[j+1];
            }
            //First element of array will be added to the end
            a[j] = first;
        }
        System.out.println();
        System.out.println("Array after left rotation");
        for (int i: a) {
            System.out.print(i + " ");
        }
    }
}
