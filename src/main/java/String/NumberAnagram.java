package String;

import java.util.Arrays;

public class NumberAnagram {
    public static void main(String []args){
        int n1=123;
        int n2=231;

       String s1= Integer.toString(n1);
       String s2= Integer.toString(n2);

        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        boolean isAnagram=false;

        if(c1.length!=c2.length){
            System.out.println("Strings not anagram");
        }
        else{

            for(int i=0;i<c1.length;i++){
                if(c1[i]!=c2[i]){
                    isAnagram=false;
                    System.out.println("Strings not anagram");
                    break;
                }
                else{
                    isAnagram=true;
                }
            }

        }

        if(isAnagram){
            System.out.println("Strings are anagram:"+s1+" "+ s2);
        }
    }
}
