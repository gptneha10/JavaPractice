package String;

import java.util.HashSet;

public class aa {

    public static void main(String args[]){
        String s="java is best";

        String s1[]=s.split(" ");
        String revString="";

        for(int i=s1.length-1;i>=0;i--){
            revString=revString+s1[i]+ " ";

        }

        System.out.println(revString);


        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(null);
        hs.add(null);
        hs.add(null);


        System.out.println(hs);
;    }
}
