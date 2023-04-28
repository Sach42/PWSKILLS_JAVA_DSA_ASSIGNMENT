package Array_assignment.assignment1;

public class even_element {
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        for(int ele:arr){
            if(ele%2==0){
                System.out.print(ele+" ");
            }
        }
    }
}
