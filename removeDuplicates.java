
public class removeDuplicates {
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,3,4,4,5,5};
        System.out.println(removeduplicate(arr));
        
    }
    public static int removeduplicate(int[] arr){
        int n = arr.length;
        int i = 0;
        for(int j =1;j<n;j++){
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
       return i+1; 
    }
}
