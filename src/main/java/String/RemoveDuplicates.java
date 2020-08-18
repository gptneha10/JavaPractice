package String;
import java.util.*;
import java.util.stream.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        String s = "nehqageuapwta";
        char[] sChar=s.toCharArray();
        List<Character> slist =new ArrayList<Character>();

        for(char c:sChar){
            slist.add(c);
        }


        Set<Character> set = new HashSet<Character>();


        System.out.println(slist.stream().filter(n -> set.add(n)).collect(Collectors.toList()));

    }
}