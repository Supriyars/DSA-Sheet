import java.util.*;
public class Fibonacci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1 || n==2){
            System.out.println("The " + n + "th fibonacci number is 1");
            sc.close();
            return;
        }
        int first = 1;
        int second = 1;
        int next =0;
        for(int i =3;i<=n;i++){
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println("The " + n + "th fibonacci number is: " + next);
        sc.close();
    }
}