//How to find the first non-repeating character in a given String
//
//Read more: https://www.java67.com/2018/04/21-string-programming-and-coding-interview-questions-answers.html#ixzz6SXtH6DR5
package String;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

    public static void main(String args[]) {

        String s="javja";
        char[] ch=s.toCharArray();

        Map<Character,Integer> m=new LinkedHashMap<>();

        for(int i=0;i<ch.length;i++){
            if(m.containsKey(ch[i])){
               m.put(ch[i],m.get(ch[i])+1);
            }
            else{
                m.put(ch[i],1);
            }
        }

        for(Map.Entry<Character,Integer> c: m.entrySet()){
            System.out.println(c.getKey()+ ":"+ c.getValue());
            if(c.getValue()==1){
                System.out.println(c.getKey());
                break;
            }
        }




    }


}

