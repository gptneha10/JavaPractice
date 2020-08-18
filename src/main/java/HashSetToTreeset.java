import java.util.HashSet;
import java.util.TreeSet;
import java.util.ArrayList;

public class HashSetToTreeset {

    public static void main(String []s){
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(1);
        hs.add(5);
        hs.add(1);
        hs.add(2);

        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.addAll(hs);

        for(int i:ts){
            System.out.print(i + " ");
        }

        ArrayList<String> hs1=new ArrayList<String>();
        hs1.add("neha");
        hs1.add("manish");

        System.out.println("");
        for(String s1: hs1){
            System.out.print(s1+ " ");
        }

        System.out.println("");



    }
}
