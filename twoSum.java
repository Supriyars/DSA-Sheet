import java.util.*;
public class twoSum{
    public static void main(String[] args){
      int[] arr = {1,2,3,4,5,6};
      int target = 11;
      System.out.println(Arrays.toString(getTwoSum(arr,target)));
    }
    public static int[] getTwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n= arr.length;
        for(int i =0;i<n;i++){
         int compliment = target - arr[i];
         if(map.containsKey(compliment)){
            return new int[]{map.get(compliment), i};
         }
         map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
   
}
