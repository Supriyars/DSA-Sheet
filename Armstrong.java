import java.util.*;
public class Armstrong {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(isarmstrong(num));
    sc.close();
  }
  public static boolean isarmstrong(int num){
    int originalNum = num;
    int temp = num;
     int count =0;
     while(temp!=0){
        count++;
        temp = temp / 10;
     }
     int sum =0;
     temp = num;
     while(temp!=0){
        int digit = temp % 10;
        sum = sum + (int)Math.pow(digit,count);
        temp = temp / 10;
     }
     return sum == originalNum;
  }  
}
