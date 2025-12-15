//https://www.geeksforgeeks.org/problems/java-switch-case-statement3529/1 - Question link
import java.util.*;
public class SwitchCase{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Choice: ");
    System.out.println("1. Area of Circle: ");
    System.out.println("2. Area of Rectangle: ");
    int choice = sc.nextInt();
    List<Double> arr = new ArrayList<>();
    if(choice == 1){
        System.out.println("Enter the Radius: ");
        double R = sc.nextDouble();
        arr.add(R);
    } else if(choice == 2){
        System.out.println("Enter the Length: ");
        double L = sc.nextDouble();
        arr.add(L);
        System.out.println("Enter the Breadth: ");
        double B = sc.nextDouble();
        arr.add(B);
    } else {
        System.out.println("Invalid Choice!");
        sc.close();
        return;
    }
    double result = areaSwitchcase(choice, arr);
    System.out.println("Area = " + result);
    sc.close();
   
}
public static double areaSwitchcase(int choice, List<Double> arr){
    double area = 0.0;
    switch(choice){
        case 1:
          double R = arr.get(0);
          area = Math.PI*R*R;
         break;
        case 2:
          double L = arr.get(0);
          double B = arr.get(1);
          area = L * B;
          break;
        default:
          System.out.println("Invalid Choice!");
    }
    return area;
}
}