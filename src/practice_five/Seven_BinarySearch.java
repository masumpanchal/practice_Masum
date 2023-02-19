package practice_five;
//Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
//In case of binary search, array elements must be in ascending order.
//If you have unsorted array, you can sort the array using Arrays.sort(arr) method.

import java.util.Arrays;

public class Seven_BinarySearch {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};
        int key = 30;
        int last = arr.length-1;
        binarySearch(arr,0,last,key);

        //Using Arrays.binarySearch() method
        int result = Arrays.binarySearch(arr, key);
        System.out.println(result);
    }
    public static void binarySearch(int arr[], int first, int last, int key) {
        int mid = first + (last - first) / 2;
        while (first <= last) {
            if (arr[mid] < key){
                first = mid+1;
            }
            else if (arr[mid] == key){
                System.out.println("Element is found at index: " + mid);
                break;
            }
            else {
                last = mid - 1;
            }
            mid = first + (last-first)/2;
        }
        if (first > last){
            System.out.println("Element not found!");
        }
    }
}
