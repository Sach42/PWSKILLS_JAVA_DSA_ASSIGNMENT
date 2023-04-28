package Array_assignment.assignment1;

public class evensum {
    public static void main(String[] args) {
        int[] arr = {3,20,4,6,9};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
    //check whether the indices are even or not
          if(i%2 == 0){
            sum += arr[i];
          }  

        }
        System.out.println(sum);
    }
}
