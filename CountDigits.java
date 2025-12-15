import java.util.*;
public class CountDigits {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int temp = N;
    int count =0;
    while(temp!=0){
        int rem = temp % 10;
        if(rem != 0 && N%rem==0){
            count++;
        }
        temp  = temp / 10;
    }
    System.out.println(count);
    sc.close();
  }
}
