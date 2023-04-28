package Array_assignment.assignment1;

public class peak_ele {
    public static void main(String[] args) {
        int[] arr = {1,4,7,3,2,6,5};

        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                max = arr[i];
            }
           
        }

        System.out.println(max);

    }
}
