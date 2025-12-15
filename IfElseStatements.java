import java.util.*;
public class IfElseStatements {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    ifelse(m,n);
    sc.close();
}  
static void ifelse(int m, int n){
    if(n>m){
        System.out.println("greater");
    } else if(n<m) {
        System.out.println("lesser");
    } else {
        System.out.println("equal");
    }
}  
}
