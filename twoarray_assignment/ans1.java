package twoarray_assignment;
import java.util.*;

public class ans1 {
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

        int positive = 0;
        int negative = 0;
        int odd = 0;
        int even = 0;
        int zero_count = 0;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] > 0){

                    positive++;
                }
                else if(arr[i][j] < 0){
                    negative++;
                }
                 if(arr[i][j]%2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
                if(arr[i][j]==0){
                    zero_count++;
                }
            }
        }
        System.out.println("positive :"+ positive);
        System.out.println("negative :"+ negative);
        System.out.println("odd :"+ odd);
        System.out.println("even :"+ even);
        System.out.println("0 :"+ zero_count);
    }
}
