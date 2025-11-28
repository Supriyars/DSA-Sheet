public class SortedArray {
    public static void main(String[] args){
        int[] arr = {1,5,8,9,10,45};
        System.out.println(sortArray(arr));

        
    }
    public static boolean sortArray(int[] arr){
        int n = arr.length;
        for(int i=1;i<n;i++){
            if(arr[i] >= arr[i-1]){

            } else {
                return false;
            }
        }
        return true;
    }
}
