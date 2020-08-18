import java.util.HashMap;
import java.util.Map;

public class FindMaxCharacter {

    public static void main(String []args){
        String s="Hi,iamNehaGupta";

        HashMap<Character,Integer> map= maxCharacterCount(s);
      //  printMap(map);
        System.out.println(map);

    }
    public static HashMap<Character,Integer> maxCharacterCount(String s){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

       for(int i=0;i<s.length();i++){
        int count=1;
           if(!map.containsKey(s.charAt(i))) {
               map.put(s.charAt(i), 1);
           }
           else{
              int value=map.get(s.charAt(i))+1;
               map.put(s.charAt(i),value);
           }
        }
       return map;
    }

  /*  public static void printMap(HashMap<T,V> map){
        System.out.println(map);


    }*/
}
