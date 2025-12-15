import java.util.*;
public class GCDorHCF{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The gcd and hcf of numbers is: " + Arrays.toString(gcdorhcf(a,b)));
        sc.close();
    }
    static int[] gcdorhcf(int a, int b){
        int originalA = a;
        int originalB = b;
        while(b!=0){
            int temp = a % b;
            a = b;
            b= temp;
        }
        int gcd = a;
        long lcmLong = (long) originalA * originalB / gcd;
        int lcm = (int) lcmLong;
        return new int[]{lcm, gcd};
    }
}