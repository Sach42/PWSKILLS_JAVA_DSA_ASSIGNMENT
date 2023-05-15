package Assignment_2.sorting_array;
import java.util.*;
public class descending_sort {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        int n = arr.length;
        // Sorting in descending order using concept of bubble sort

        int temp = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                 if(arr[j] < arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 }
            }
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
