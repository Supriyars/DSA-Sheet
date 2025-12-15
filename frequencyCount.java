import java.util.*;
public class frequencyCount {
    public static void main(String[] args){
          int[] arr = {2, 3, 2, 5, 3};

        // Create object of the class
        frequencyCount obj = new frequencyCount();

        // Call the method and store result
        List<Integer> result = obj.freqCount(arr);

        // Print the result
        System.out.println(result);
    }
    public List<Integer> freqCount(int[] arr){
        int N = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        // count occurence
        for(int i=0;i<N;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1;i<=N;i++){
            result.add(map.getOrDefault(i,0));
        }
        return result;
    }
}
