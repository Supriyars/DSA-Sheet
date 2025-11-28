public class SecondLargestElementinArray {
    public static void main(String[] args){
        int[] arr = {34,3,67,2,98,12,77};
        int n = arr.length;
        int largest = -1;
        int secondLargest = -1;
        for(int i=0;i<n;i++){
            int num = arr[i];
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if(num < largest && num > secondLargest){
                secondLargest = num;
            }
        }
        System.out.println("the secondLargest element in Array is: " + secondLargest);
    }
}
