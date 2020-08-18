//print start pattern in left traingle
package General;

public class StarPatternLeftTraingle {
    public static void main(String []args) {
        //  int n = 5;
        for (int i = 1; i <= 5; i++) {
            for(int n=i;n>0;n--){
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
