public class MissingElement {
    public static void main(String[] args){
        int[] arr = {0,1,2,3,4,6,7};
        System.out.println(findElement(arr));
    }
    public static int  findElement(int[] arr){
        int allXOR = 0;
        for(int i=0;i<=arr.length;i++){
            allXOR = allXOR ^ i;
        }
        for(int num : arr){
            allXOR = allXOR ^ num;
        }
        return allXOR;
    }
}
// Keep these points in mind
 // 4 XOR 4 = 0;
 // 4 XOR 0 = 4;