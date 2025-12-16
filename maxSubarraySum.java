

public class maxSubarraySum {
    public static void main(String[] args){
      int[] arr = {-2,-3,4,-1-2,1,5,-3};
      System.out.println(subArray(arr));
    }
    public static int subArray(int[] arr){
        int n = arr.length;
        int currSum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(currSum  < 0){
                currSum = 0;
            }
            currSum += arr[i];
            max = Math.max(max, currSum);
        }
        return max;
    }
}
