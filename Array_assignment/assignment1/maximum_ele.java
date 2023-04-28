package Array_assignment.assignment1;

public class maximum_ele {
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        int max = 0;

        for(int ele:arr){
            max = Math.max(max, ele);
        }
        System.out.println(max);
    }
}
