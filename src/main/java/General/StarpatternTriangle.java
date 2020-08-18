 /*print a star pattern in triangle
   *
  * *
 * * *
* * * *
         */
package General;

public class StarpatternTriangle {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <= n; i++) {
            int j;
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            for (int k = j; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}

