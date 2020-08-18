//Longest repeating character substring
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingSubstring {
    public static void main(String []args){
        String s="aabaaaaaaaaaaaaaaaaaaaaaaaabcskkkkkkcasjhdskjaskk";

        HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
        char ch=' ';
        for(int i=0;i<s.length();i++){
            if(hm.containsKey(s.charAt(i)) && ch==s.charAt(i)){
                System.out.println("1111111");
                System.out.println(hm.get(s.charAt(i)));
                   hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
            else if (!hm.containsKey(s.charAt(i)) || (hm.containsKey(s.charAt(i)) && ch!=s.charAt(i))){
                System.out.println("22222222");
                hm.put(s.charAt(i),1);
                ch=s.charAt(i);
                System.out.println("ch: "+ch);

            }
            }

        int maxValue= Collections.max(hm.values());
        System.out.println("maxvalue: "+maxValue);
        for(Map.Entry entry:hm.entrySet()){
            System.out.print(entry.getKey()+" "+entry.getValue()+", ");
            if(maxValue==(Integer)entry.getValue()) {
                for(int i=0;i<maxValue;i++) {
                    System.out.print(entry.getKey());
                }
            }
        }
    }
}
