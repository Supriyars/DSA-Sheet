import java.util.*;

public class Sumofdivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println("Sum of divisors from 1 to " + n + " is: " + sumOfDivisors(n));
        sc.close();
    }

    static long sumOfDivisors(long num) {
        long sum = 0;
        for (int i = 1; i <= num; i++) {
            if(num%i==0){
                sum += i;
            }
        }
        return sum;
    }
}
