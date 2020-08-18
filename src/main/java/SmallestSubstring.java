import java.util.HashMap;

public class SmallestSubstring {
    public static void main(String []s){
        String s1="this is a test string";
        String s2="tist";


        HashMap<Character,Integer> s2Map=new HashMap<Character,Integer>();
        for(int x=0;x<s2.length();x++){
            //int count=0;
            if(s2Map.containsKey(s2.charAt(x))) {
                s2Map.put(s2.charAt(x), s2Map.get(s2.charAt(x)) + 1);
            }
            else{
                s2Map.put(s2.charAt(x), 1);
            }
        }
       // System.out.println("Map :"+ s2Map);

        String substring = "";
        int a=0;
        while(a<s1.length()){
            if(s1.length()-a >s2.length()) {
                String temp = "";
                int count = 0;
                HashMap<Character,Integer> subMap=new HashMap<Character,Integer>();
                for (int i = a; i < s1.length(); i++) {

                    /*System.out.println("s1.charAt(i))"+ s1.charAt(i));
                    System.out.println("subMap.get(s1.charAt(i))"+ subMap.get(s1.charAt(i)));
                    System.out.println("s2Map.get(s1.charAt(i))"+ s2Map.get(s1.charAt(i)));*/
                if(s2Map.containsKey(s1.charAt(i))){
                    //int size = ;

                    if(subMap.containsKey(s1.charAt(i)) && (subMap.get(s1.charAt(i))< s2Map.get(s1.charAt(i)))  ) {
                            subMap.put(s1.charAt(i), subMap.get(s1.charAt(i)) + 1);
                            count = count + 1;

                        } else if(!subMap.containsKey(s1.charAt(i))) {
                            subMap.put(s1.charAt(i), 1);
                            count = count + 1;
                        }
                    temp = temp + s1.charAt(i);
                  /*  System.out.println("temp1: "+temp);
                    System.out.println("count1: "+count);*/
                }
                else if((count > 0 && count < s2.length()) && !s2Map.containsKey(s1.charAt(i))){
                    temp = temp + s1.charAt(i);
                   /* System.out.println("temp2: " + temp);
                    System.out.println("count2: "+count);
*/
                }



                    if (count == s2.length() && substring.length() == 0) {
                        substring = temp;
                        temp="";
                        count = 0;
                        //System.out.println("substring1:" +substring);
                    } else if (count == s2.length() && temp.length() < substring.length()) {
                        substring = temp;
                        temp="";
                        count = 0;
                    }
                }
                a++;
            }
           else {
               break;
            }

        }
        System.out.println(" smallest substring :"+ substring);




    }
}
