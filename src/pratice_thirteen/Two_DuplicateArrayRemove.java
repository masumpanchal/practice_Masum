package pratice_thirteen;

public class Two_DuplicateArrayRemove {
    public static void main(String[] args){
        int arr[] = {10,20,20,30,30,40,50,50};
        int jm = arr.length;
        jm = removeDuplicate(arr, jm);
        for (int i=0; i<jm; i++){
            System.out.println(arr[i]+ " ");
        }
    }
    //Remove Duplicate Element in Array using Temporary Array
    public static int removeDuplicate(int a[], int n){

        int k=0;
        int temp[] = new int[n];
        for (int i=0; i<n-1; i++) {
            if (a[i] != a[i+1]) {
                temp[k++] = a[i];
            }
        }
        temp[k++] = a[n-1];
        //changing original array
        for(int i=0; i<k; i++){
            a[i] = temp[i];
        }
        return  k;
    }
//------------------------------------------------------------------------------------------------------------------------------

    //Remove Duplicate Element in Array using separate index
    public static int removeDuplicate2(int b[], int n){
        int j=0;
        for (int i=0; i<n-1; i++){
            if (b[i] != b[i+1]){
                b[j++] = b[i];
            }
        }
        b[j++] = b[n-1];
        return j;
    }

}


