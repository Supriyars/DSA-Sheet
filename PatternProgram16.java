import java.util.*;
public class PatternProgram16 {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=1;i<=n;i++){
        for(int s=1;s<=n-i;s++){
            System.out.print("  ");
        }
        for(int j=1;j<=i;j++){
            char ch = (char)('A' + j-1);
            System.out.print(ch + " ");
        }
         for(int j=i-1;j>=1;j--){
            char ch = (char)('A' + j -1);
            System.out.print(ch + " ");
        }
        System.out.println();
     }
     sc.close();
   }   
}
