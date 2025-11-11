import java.util.*;
public class WhileLoop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printTable(n);
        sc.close();
    }
    public static void printTable(int n){
        int i = 10;
        while(i>=1){
            System.out.print((n*i) + " ");
            i--;
        }
        System.out.println();
    }
}
