import java.util.Scanner;
public class DataTypes {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    System.out.println(dataTypeSize(str));
    sc.close();
  } 
  static int dataTypeSize(String str){
    if(str.equals("Character")){
        return 2;
    } else if (str.equals("Integer")){
        return 4;
    } else if(str.equals("Long")){
        return 8;
    } else if(str.equals("Float")){
        return 4;
    } else if(str.equals("Double")){
        return 8;
    }
    return -1;
  } 
}
