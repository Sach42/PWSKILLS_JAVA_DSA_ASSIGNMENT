package Array_assignment.assignment1;

public class second_largest {
    public static int secondlargest(int[] arr){
        int flarge = Integer.MIN_VALUE;
        int Slarge = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(flarge < arr[i]){
                Slarge = flarge;
                flarge = arr[i];
            }
            else if(Slarge<arr[i] && arr[i]<flarge){
                Slarge = arr[i];
            }
        }
        return Slarge;

    }
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        System.out.println(secondlargest(arr));

    }
}
