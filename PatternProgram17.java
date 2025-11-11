import java.util.*;
public class PatternProgram17 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        char ch = (char) ('A' + n -1);
        for(int j=0;j<=i;j++){
            System.out.print((char)(ch-j)+ " ");
        }
        System.out.println();
    }
    sc.close();
  }  
}
