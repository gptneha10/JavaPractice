package String;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String []args){
        String s1="neha";
        String s2="neha";

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
