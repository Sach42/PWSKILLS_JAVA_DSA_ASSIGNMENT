package twoarray_assignment;
import java.util.*;
public class largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the m size :");
        int m = sc.nextInt();
       
        System.out.println("Enter the n size:");
        int n = sc.nextInt();
        

        //declare the 2d array
        int[][] arr = new int[m][n];
        System.out.println("eneter the element:");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = sc.nextInt();

            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                max = Math.max(max, arr[i][j]);
            }
        }
        System.out.println(max);
    }
}
