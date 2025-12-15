import java.util.*;
public class Palindrome {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int original =n;
    int rev =0;
    while(n!=0){
        int rem = n % 10;
        if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
            System.out.println(0);
        }
        rev = rev * 10 + rem;
        n = n/10;
  
    }
    if(rev == original){
        System.out.println("Its a Plaindrome");
    } else {
        System.out.println("Not a Palindrome");
    }
    sc.close();
  }  
}
