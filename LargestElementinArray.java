
public class LargestElementinArray {
    public static void main(String[] args){
        int[] arr = {9,1,6,7,91,8,3};
        largestElement(arr);

    }
    public static void largestElement(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("Largest Element is: " + largest);
    }
}

