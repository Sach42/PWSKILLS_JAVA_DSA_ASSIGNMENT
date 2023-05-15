package Assignment_2.sorting_array;

public class second {
    public static void main(String[] args) {
        int[] arr = {3,5,1,6,0};
        int n = arr.length;
        // Sorting in descending order using concept of selection sort

        for(int i=0; i<n-1; i++){
            int min = i;
            for(int j=i+1; j<n; j++){
                if(arr[j] > arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }

        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
