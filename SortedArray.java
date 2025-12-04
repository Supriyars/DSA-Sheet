public class SortedArray{
    public static void main(String[] args){
      int[] arr = {3,7,9,8,6};
      System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] > arr[i-1]){

            } else {
                return false;
            }
        }
        return true;
    }
}