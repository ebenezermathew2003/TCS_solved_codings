/* Given an integer array Arr of size N the task is to find the count of elements whose value is greater than all of its prior elements.

Note : 1st element of the array should be considered in the count of the result. */
import java.util.*;
public class tcs3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = arr[0]; 
        int count = 1; 
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                count++;
            }
        }
        
        System.out.println(count);
        
    }
    
}
