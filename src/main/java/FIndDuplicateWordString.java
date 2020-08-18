//java program to find the duplicate words and their number of occurrences in a string
import java.util.HashMap;
import java.util.Map;
public class FIndDuplicateWordString {

    public static void main(String []args) {
        String s = "i am Neha. i go to office to earn money";
    HashMap<String,Integer> hm=new HashMap  <String,Integer>();
        String[] sa = s.split(" ");
        for (int i = 0; i < sa.length; i++) {
            if(hm.containsKey(sa[i])){
                hm.put(sa[i],hm.get(sa[i])+1);
            }
            else{
                hm.put(sa[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry: hm.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+":" + entry.getValue());
            }

        }
    }
}
