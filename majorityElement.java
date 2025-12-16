public class majorityElement {
    public static void main(String[] args){
      int[] arr = {1,5,5,5,7,8,9,5,4,5,3,5,5};
      System.out.println(getElement(arr));
    }
    public static int getElement(int[] arr){
        int count =0;
        int element =0;
        for(int i=0;i<arr.length;i++){
            if(count ==0){
                count = 1;
                element = arr[i];

            } else if(arr[i] == element){
                count++;
            } else {
                count--;
            }
        }
        return element;
    }
}
