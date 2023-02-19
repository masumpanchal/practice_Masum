package practice_two;

//Coping array
public class Seven {
    public static void main(String[] args){
        int arr[] = {1, 2, 5, 4 , 6, 5, 8, 10, 6};
        int arr2[] = new int[arr.length];

        for (int i = 0; i<arr.length; i++){
            arr2[i] = arr[i];
            System.out.print(arr2[i]+" ");
        }
    }
}
