public class SecondLargestElementinArray{
    public static void main(String[] args){
        int[] arr = {3,6,1,7,2,8,21};
        secondLarge(arr);
    }
    public static void secondLarge(int[] arr){
        int n = arr.length;
        int largest = -1;
        int secondlargest = -1;
        for(int i=0;i<n;i++){
            int num = arr[i];
            if(num > largest){
                secondlargest = largest;
                largest = num;
            } else if(num < largest && num > secondlargest){
                secondlargest = num;
            }
        }
        System.out.println("The secondLargest element is: " + secondlargest);
    }
}