//Longest non repeating character substring

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestNonRepeatingSubstring {
    public static void main(String []args){
        String s="programoftheday12";

       // char[] ch=new char[s.length()];
        String substr="";

        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        String ss="";
       for(int i=0;i<s.length();i++) {


                if (hm.containsKey(s.charAt(i))) {
                    if(substr.length()<ss.length()){
                        substr=ss;
                    }

                   ss="";
                    i=hm.get(s.charAt(i));
                   hm.clear();
                } else {
                    hm.put(s.charAt(i), i);
                    ss = ss + s.charAt(i);
                }
            }



        System.out.println(substr);

    }

}
