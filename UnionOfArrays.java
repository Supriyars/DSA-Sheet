import java.util.*; 
public class UnionOfArrays{
   public static void main(String[] args){
    int[] arr1 = {1,2,3,4,5,6};
    int[] arr2 = {1,2,3,5,6,7};
    System.out.println(findUnion(arr1, arr2));
   }
   public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2){
    ArrayList<Integer> result = new ArrayList<>();
    int n = arr1.length;
    int m = arr2.length;
    int i=0,j=0;
    while(i<n && j<m){
        int x = arr1[i];
        int y = arr2[j];
        if(arr1[i] < arr2[j]){
            result.add(x);
            while(i<n && arr1[i] == x){
                i++;
            }
        } else if(arr1[i] > arr2[j]){
            result.add(y);
            while(j<m && arr2[j] == y){
                j++;
            }
        } else {
            
                result.add(x);
                while(i<n && arr1[i] == x){
                    i++;
                }
                while(j<m && arr2[j] == y){
                    j++;
                }
        }
    }
    while(i<n){
        int x = arr1[i];
        result.add(x);
        while(i<n && arr1[i] == x){
            i++;
        }
    }
    while(j<m){
        int y = arr2[j];
        result.add(y);
        while(j<m && arr2[j] == y){
            j++;
        }
    }
    return result;
    
   }
}