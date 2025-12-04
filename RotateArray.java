import java.util.*;
public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7};
         System.out.println("Enter the k: ");
        int k = sc.nextInt();
       
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));
        sc.close();

    }
    public static void rotate(int[] arr, int k){
        int n = arr.length;
        k = k%n; //  to check whether k is larger than length of array 
        reverse(arr, 0,n-1); // reverse the whole array
        reverse(arr, 0,k-1); // reverse the array from start to k elements
        reverse(arr, k, n-1);//reverse the elements from k to n-1 means k to last elements
    }
    public static void reverse(int[] arr, int start, int end){
        while(start< end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end] = temp;
           start++;
           end--;
        }
    }
}
