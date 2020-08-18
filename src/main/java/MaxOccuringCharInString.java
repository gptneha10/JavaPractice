// Find Max occurence in string , java , o/p=a
import java.util.HashMap;
import java.util.Map;

public class MaxOccuringCharInString {
        public static void main(String[] args) {

            String s="n12    21";

            maxChar(s);
        }

        public static  void maxChar(String s){
            Map<Character,Integer> m=new HashMap<Character,Integer>();
            char [] ca=s.toCharArray();
            char maxChar=' ';
            int max=0;

            for (int i=0;i<ca.length;i++){
                if(m.containsKey(ca[i])){
                    m.put(ca[i],m.get(ca[i])+1);

                }
                else{
                    m.put(ca[i],1);

                }

                if(max<m.get(ca[i])){
                    maxChar=ca[i];
                    max=m.get(ca[i]);
                }
            }

            System.out.println(maxChar +":"+ max);


/*
            for(Map.Entry<Character,Integer> ch:m.entrySet()){
                System.out.print(ch.getKey()+ ":");
                System.out.println(ch.getValue());

            }*/

        }
    }