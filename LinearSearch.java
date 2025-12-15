import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Enter the value you want to find: ");
        int x = sc.nextInt();
        System.out.println(findElement(arr, x));
        sc.close();

    }
    public static boolean findElement(int[] arr, int x){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i] == x){
                return true;
            } 
        }
        return false;
       
    }
}
