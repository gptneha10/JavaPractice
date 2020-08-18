//check an integer number is palindrome of not
package General;

public class IntPalindrome {
    public static void main(String []args){
        int n=11311;
        int num=n;
        System.out.println(num);
        int rev=0;


        while(n>0){
            int rem=n%10;
            rev=rev*10 + rem;
            n=n/10;
        }

      //  Integer.compare()
        if(num==rev){
            System.out.println(num+ " is palindrome: "+ rev);
        }
        else{
            System.out.println(num+ " is not palindrome: "+ rev);
        }
    }
}
