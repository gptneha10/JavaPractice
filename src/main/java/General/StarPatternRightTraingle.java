//print start pattern in right traingle
package General;

public class StarPatternRightTraingle {
    public static void main(String[] args) {
        //  int n = 5;
        int temp= 0;
        for (int i = 1; i <= 5; i++) {
            int n = i;
            for (n=1; n <= 5-i; n++) {
                System.out.print(" ");
            }
            for(int m=n;m<=5;m++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
/*
        *
      * *
    * * *
  * * * *
* * * * *
*/
