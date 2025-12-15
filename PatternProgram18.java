import java.util.*;
public class PatternProgram18 {
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
    int size = 2 * n; // number of rows and columns (positions)

        for (int r = 1; r <= size; r++) {
            // t is how far we are from the top within the first half (0..n-1)
            int t = (r <= n) ? (r - 1) : (size - r);

            // threshold controls how many star-columns are kept at the edges
            int threshold = (n - 1) - t;

            for (int c = 1; c <= size; c++) {
                // leftDepth = distance from column to nearest vertical edge (0..n-1)
                int leftDepth = Math.min(c - 1, size - c);

                if (leftDepth <= threshold) {
                    // print a star followed by a space (matches sample format)
                    System.out.print("* ");
                } else {
                    // print two spaces (keeps alignment because stars are printed as "* ")
                    System.out.print("  ");
                }
            }
            System.out.println(); // next row
        }
        sc.close();
   } 
}
