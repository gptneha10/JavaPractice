// reverse a array and store it in same array

public class Palindrome {
    public static void main(String []args){
        String s="1nitin11";

        char[] ch=s.toCharArray();
        int j=ch.length-1;
        boolean isPalindrome=false;

        for(int i=0;i<ch.length/2;i++,j--){
           if(ch[i]!=ch[j]){
               System.out.println(ch[i]);
               System.out.println(ch[j]);
               isPalindrome=false;
               break;
           }
           else{
               isPalindrome=true;
           }
        }



        if(isPalindrome){
            System.out.println(s+ " is palindrome");
        }
        else{
            System.out.println(s+ " is not a palindrome");
        }

        //Nitin


    }
}
