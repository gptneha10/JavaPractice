
// add two big numbers without using + operator

package General;

import java.math.BigInteger;
import java.util.Scanner;

//import java.util.Scanner;
public class AddNumbers {

    public static void main(String[] args) {

    /*    String s1 = "56789999999666666666";
        String s2 = "5678988888885556";*/

        String s1 = "56789999999666666666";
        String s2 = "56789888888855567777";

        String bigNum = "";
        String smallNum = "";

        if (s1.length() > s2.length()) {
            bigNum = s1;
            smallNum = s2;
        } else {
            bigNum = s2;
            smallNum = s1;
        }

        smallNum =leftPad(smallNum,bigNum.length());
        System.out.println("SmallNum: " + smallNum);
        System.out.println("bigNum: " + bigNum);
        System.out.println("SmallNum length:"+ smallNum.length() );
        System.out.println("bigNum length:"+ bigNum.length() );

        int i1;
        String sum = "";
        int carry = 0;
        int i;

        for (i = smallNum.length()-1; i >=0 ; i--) {
            i1 = Character.getNumericValue(smallNum.charAt(i)) + Character.getNumericValue(bigNum.charAt(i));
            System.out.println("smallNum.charAt(i): " + smallNum.charAt(i));
            System.out.println("bigNum.charAt(i): " + bigNum.charAt(i));
            System.out.println("i1: " + i1);
            int rem = i1 % 10;
            System.out.println("rem: " + rem);

            System.out.println("carry: " + carry);
            int temp = rem + carry;
            sum = sum + temp;
            carry = i1 / 10;
            System.out.println("sum: " + sum);
            System.out.println("=================");

        }

        if(carry!=0) {
            sum = sum + carry;
        }

        String sumMain = "";
        for (int k = sum.length() - 1; k >= 0; k--) {
            sumMain = sumMain + sum.charAt(k);
        }

        System.out.println("sumMain: " +sumMain);

    }
        public static String leftPad(String inputString, int length){

        if(inputString.length()>length){
            return inputString;
        }
        else{
            StringBuilder s=new StringBuilder();

            while(s.length()< (length - inputString.length())){
                s=s.append(0);
            }
            s=s.append(inputString);
            return s.toString();
        }


        }









}
