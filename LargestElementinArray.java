public class LargestElementinArray {
    public static void main(String[] args){
         int[] arr = {5,64,7,1,8,9,34,99};
         int n = arr.length;
         int largest = arr[0];
         for(int i =0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
         }
         System.out.println("The largest element in array is: " + largest);
    }
}
